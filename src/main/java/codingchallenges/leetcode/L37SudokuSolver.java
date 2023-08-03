package codingchallenges.leetcode;

public class L37SudokuSolver {

	/* Helpful explanation: https://www.youtube.com/watch?v=mcXc8Mva2bA */
	public static void main(String[] args) {

		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		solveSudoku(board);
	}
	public static void solveSudoku(char[][] board) {
		if (solveBoard(board)) {
			System.out.println("Solved successfully!");
		} else {
			System.out.println("Unsolvable board");
		}
		printBoard(board);
	}
	private static void printBoard(final char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 9; k++) {
				System.out.print(board[i][k]);
			}
			System.out.println();
		}
	}
	private static boolean isNumberInRow(char[][] board, char number, int row) {
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == number) {
				return true;
			}
		}
		return false;
	}
	private static boolean isNumberInColumn(char[][] board, char number, int column) {
		for (int i = 0; i < 9; i++) {
			if (board[i][column] == number) {
				return true;
			}
		}
		return false;
	}
	private static boolean isNumberInBox(char[][] board, char number, int row, int column) {
		// We need to find the top left coordinate of the box
		int localBoxRow = row - row % 3;
		int localBoxColumn = column - column % 3;
		for (int i = localBoxRow; i < localBoxRow + 3; i++) {
			for (int k = localBoxColumn; k < localBoxColumn + 3; k++) {
				if (board[i][k] == number) {
					return true;
				}
			}
		}
		return false;
	}
	private static boolean isValidPlacement(char[][] board, char number, int row, int column) {
		// Number is not in row AND number is not in column AND number is not in box
		return !isNumberInRow(board, number, row) && !isNumberInColumn(board, number, column) &&
				!isNumberInBox(board, number, row, column);
	}
	private static boolean solveBoard(char[][] board) {
		// The idea here is to start at the first space on the board we need to fill in, find
		// a candidate value that meets the three criteria and move onto the next square. When we
		// reach a dead end we backtrack to the previous value and try another value and start again.
		// We almost kind of defrag the whole board and slowly chip away at it until it's all filled in.
		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				if (board[row][column] == '.') {
					// When we find a spot that isn't filled in we start trying number 1-9
					for (int numberToTry = 1; numberToTry <= 9; numberToTry++) {
						char charNumber = (char) (numberToTry + '0');
						if (isValidPlacement(board, charNumber, row, column)) {
							board[row][column] = charNumber;
							if (solveBoard(board)) {
								return true;
							} else {
								// Reset value and move on to next number to try
								board[row][column] = '.';
							}
						}
					}
					// We tried all numbers 1-9 for a given spot and still couldn't solve
					return false;
				}
			}
		}
		return true;
	}
}
