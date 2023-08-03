package codingchallenges.hackerrank;
import java.util.Arrays;
import java.util.List;
public class HRMatrixFlip {

	public static void main(String[] args) {
		List<List<Integer>> matrix = Arrays.asList(Arrays.asList(112, 42, 83, 110), Arrays.asList(56, 125, 56, 49), Arrays.asList(15, 78, 101, 43),
				Arrays.asList(62, 98, 114, 108));

		int sum = flippingMatrix(matrix);
		System.out.println("Output: " + sum);
	}

	public static int flippingMatrix(List<List<Integer>> matrix) {
		/*
		 [112, 42, 83, 119]
		 [56, 125, 56, 49]
		 [15, 78, 101, 43]
		 [62, 98, 114, 108]
		*/

		int n = matrix.size();
		for (int i = 0; i < matrix.size(); i++) {
			int rowMaxSet1 = 0;
			int rowMaxSet2 = 0;
			for (int k = 0; k < matrix.get(i).size(); k++) {
				// Get the sum of the first n values and compare to the other half.
				if (k < n / 2) {
					rowMaxSet1 = rowMaxSet1 + matrix.get(i).get(k);
				} else {
					rowMaxSet2 = rowMaxSet2 + matrix.get(i).get(k);
				}
			}
			System.out.println("rowMaxSet1: " + rowMaxSet1);
			System.out.println("rowMaxSet2: " + rowMaxSet2);
			if (rowMaxSet2 > rowMaxSet1) {
				System.out.println("Reverse row: " + i);
				// reverse row
			}
		}

		/*
		 [112, 42, 83, 119]
		 [56, 125, 56, 49]
		 [15, 78, 101, 43]
		 [62, 98, 114, 108]
		*/
		int columnMaxSet1 = 0;
		int columnMaxSet2 = 0;
		for (int i = 0; i < matrix.size(); i++) {
			// Get the sum of the first n values and compare to the other half.
			if (i < n / 2) {
				columnMaxSet1 = columnMaxSet1 + matrix.get(i).get(i);
			} else {
				columnMaxSet2 = columnMaxSet2 + matrix.get(i).get(i);
			}
		}
		System.out.println("columnMaxSet1: " + columnMaxSet1);
		System.out.println("columnMaxSet2: " + columnMaxSet2);
		if (columnMaxSet2 > columnMaxSet1) {
			// reverse column
			System.out.println("Reverse column: ");
		}
		return 0;
	}
}
