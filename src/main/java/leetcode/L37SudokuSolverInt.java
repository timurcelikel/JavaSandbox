package leetcode;

public class L37SudokuSolverInt {

	/* Helpful explanation: https://www.youtube.com/watch?v=mcXc8Mva2bA */
	public static void main(String[] args) {

		int[][] board = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
				{ 6, 0, 0, 1, 9, 5, 0, 0, 0 },
				{ 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 },
				{ 4, 0, 0, 8, 0, 3, 0, 0, 1 },
				{ 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 },
				{ 0, 0, 0, 4, 1, 9, 0, 0, 5 },
				{ 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

		solveSudoku(board);
	}
	public static void solveSudoku(int[][] board) {
		if (solveBoard(board)) {
			System.out.println("Solved successfully!");
		} else {
			System.out.println("Unsolvable board");
		}
		printBoard(board);
	}
	private static void printBoard(final int[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 9; k++) {
				System.out.print(board[i][k]);
			}
			System.out.println();
		}
	}
	private static boolean isNumberInRow(int[][] board, int number, int row) {
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == number) {
				return true;
			}
		}
		return false;
	}
	private static boolean isNumberInColumn(int[][] board, int number, int column) {
		for (int i = 0; i < 9; i++) {
			if (board[i][column] == number) {
				return true;
			}
		}
		return false;
	}
	private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
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
	private static boolean isValidPlacement(int[][] board, int number, int row, int column) {
		// Number is not in row AND number is not in column AND number is not in box
		return !isNumberInRow(board, number, row) && !isNumberInColumn(board, number, column) &&
				!isNumberInBox(board, number, row, column);
	}
	private static boolean solveBoard(int[][] board) {
		// The idea here is to start at the first space on the board we need to fill in, find
		// a candidate value that meets the three criteria and move onto the next square. When we
		// reach a dead end we backtrack to the previous value and try another value and start again.
		// We almost kind of defrag the whole board and slowly chip away at it until it's all filled in.
		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				if (board[row][column] == 0) {
					// When we find a spot that isn't filled in we start trying number 1-9
					for (int numberToTry = 1; numberToTry <= 9; numberToTry++) {
						if (isValidPlacement(board, numberToTry, row, column)) {
							board[row][column] = numberToTry;
							if (solveBoard(board)) {
								return true;
							} else {
								board[row][column] = 0;
							}
						}
					}
					return false;
				}
			}
		}
		return true;
	}
}
