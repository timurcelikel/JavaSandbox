package leetcode;

import java.util.*;

public class L36ValidSudoku {

	public static void main(String[] args) {

		char[][] boardTrue = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
				,{'6', '.', '.', '1', '9', '5', '.', '.', '.'}
				,{'.', '9', '8', '.', '.', '.', '.', '6', '.'}
				,{'8', '.', '.', '.', '6', '.', '.', '.', '3'}
				,{'4', '.', '.', '8', '.', '3', '.', '.', '1'}
				,{'7', '.', '.', '.', '2', '.', '.', '.', '6'}
				,{'.', '6', '.', '.', '.', '.', '2', '8', '.'}
				,{'.', '.', '.', '4', '1', '9', '.', '.', '5'}
				,{'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
		
		char[][] boardFalse = {{'8','3','.','.','7','.','.','.','.'}
				,{'6','.','.','1','9','5','.','.','.'}
				,{'.','9','8','.','.','.','.','6','.'}
				,{'8','.','.','.','6','.','.','.','3'}
				,{'4','.','.','8','.','3','.','.','1'}
				,{'7','.','.','.','2','.','.','.','6'}
				,{'.','6','.','.','.','.','2','8','.'}
				,{'.','.','.','4','1','9','.','.','5'}
				,{'.','.','.','.','8','.','.','7','9'}};

		//boolean result = isValidSudoku(board);
		boolean result = isValidSudokuOptimized(boardFalse);
		System.out.println("Result: " + result);
	}

	public static boolean isValidSudokuOptimized(char[][] board) {
		// Not my solution
		HashSet<String> seen = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int k = 0; k < 9; k++) {
				char currentVal = board[i][k];
				if (currentVal != '.') {
					if (!seen.add(currentVal + " found in row " + i) ||
							!seen.add(currentVal + " found in column " + k) ||
							!seen.add(currentVal + " found in sub box " + i/3 + "-" + k/3)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public static boolean isValidSudoku(char[][] board) {
		int count = 1;
		List<Integer> q1 = new ArrayList<>();
		List<Integer> q2 = new ArrayList<>();
		List<Integer> q3 = new ArrayList<>();
		Map<Integer, List> validationColumnMap = new HashMap<>();
		for (int i = 0; i < board.length; i++) {
			if (count == 1) {
				q1 = new ArrayList<>();
				q2 = new ArrayList<>();
				q3 = new ArrayList<>();
			}
			List<Integer> validationRowList = new ArrayList<>();
			for (int k = 0; k < board[i].length; k++) {
				char c = board[i][k];
				if (c == '.') {
					continue;
				}
				if (Character.isDigit(c)) {
					// Check 1-9
					int d = c - '0';
					if (d < 1 || d > 9) {
						return false;
					} else {
						if (validationColumnMap.get(k) == null) {
							List<Integer> list = new ArrayList<>();
							list.add(d);
							validationColumnMap.put(k, list);
						} else if (validationColumnMap.get(k).contains(d)) {
							return false;
						} else {
							validationColumnMap.get(k).add(d);
						}
						if (k < 3) {
							if (q1.contains(d)) {
								return false;
							} else {
								q1.add(d);
							}
						} else if (k >= 3 && k < 6) {
							if (q2.contains(d)) {
								return false;
							} else {
								q2.add(d);
							}
						} else if (k >= 5 && k < 9) {
							if (q3.contains(d)) {
								return false;
							} else {
								q3.add(d);
							}
						}
						if (!validationRowList.contains(d)) {
							validationRowList.add(d);
						} else {
							return false;
						}
					}
				} else {
					return false;
				}
			}
			count++;
			if (count == 4) {
				count = 1;
			}
		}
		return true;
	}

}
