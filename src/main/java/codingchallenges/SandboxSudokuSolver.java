package codingchallenges;

public class SandboxSudokuSolver {

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

		if (solveBoard(board)) {
			System.out.println("Solvable Board");
		} else {
			System.out.println("Unsolvable Board");
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

	private static boolean solveBoard(final int[][] board) {
		for (int row = 0; row < 9; row++) {
			for (int column = 0; column < 9; column++) {
				if (board[row][column] == 0) {
					for (int candidateValue = 1; candidateValue <= 9; candidateValue++) {
						if (validSpace(board, row, column, candidateValue)) {
							board[row][column] = candidateValue;
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

	private static boolean validSpace(final int[][] board, final int row, final int column, final int candidateValue) {

		if (!isNumberInRow(board, row, candidateValue)
				&& !isNumberInColumn(board, column, candidateValue)
				&& !isNumberInSquare(board, row, column, candidateValue)) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isNumberInRow(final int[][] board, final int row, final int candidateValue) {
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == candidateValue) {
				return true;
			}
		}
		return false;
	}
	private static boolean isNumberInColumn(final int[][] board, final int column, final int candidateValue) {
		for (int i = 0; i < 9; i++) {
			if (board[i][column] == candidateValue) {
				return true;
			}
		}
		return false;
	}

	private static boolean isNumberInSquare(final int[][] board, final int row, final int column, final int candidateValue) {
		int squareRow = row - row % 3;
		int squareColumn = column - column % 3;
		for (int i = squareRow; i < squareRow + 3; i++) {
			for (int k = squareColumn; k < squareColumn + 3; k++) {
				if (board[i][k] == candidateValue) {
					return true;
				}
			}
		}
		return false;
	}

}
