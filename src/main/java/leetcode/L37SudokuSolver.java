package leetcode;

public class L37SudokuSolver {

	/* Helpful explanation: https://www.youtube.com/watch?v=mcXc8Mva2bA */
	public static void main(String[] args) {

		char[][] board = {{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}};

		solveSudoku(board);
	}

	public static void solveSudoku(char[][] board) {

	}

}
