package leetcode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class L414ThirdMax {

	public static void main(String[] args) {
		//int[] nums = { 1, 2 };
		int[] nums = { 1, 1, 2 };
		//int[] nums = { 2, 2, 3, 1 };
		//int returnValue = thirdMaxStream(nums);
		//int returnValue = thirdMaxStreamHybrid(nums);
		int returnValue = thirdMax(nums);
		System.out.println("Value: " + returnValue);
	}
	private static int thirdMax(final int[] nums) {
		Arrays.sort(nums);
		int max = nums[nums.length - 1];
		if (nums.length < 3) {
			return max;
		}
		int maxCounter = 1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] < max) {
				maxCounter++;
				max = nums[i];
				if (maxCounter == 3) {
					return max;
				}
			}
		}
		if (maxCounter < 3) {
			return nums[nums.length - 1];
		} else {
			return max;
		}
	}
	private static int thirdMaxStreamHybrid(final int[] nums) {
		int[] sorted = Arrays.stream(nums).distinct().sorted().toArray();
		if (sorted.length >= 3) {
			int counter = 0;
			for (int k = sorted.length - 1; k >= 0; k--) {
				if (counter == 2) {
					return sorted[k];
				}
				counter++;
			}
		}
		return sorted[sorted.length - 1];
	}

	public static int thirdMaxStream(int[] nums) {
		List<Integer> sorted = Arrays.stream(nums).boxed().distinct().sorted().collect(Collectors.toList());
		Collections.reverse(sorted);
		if (sorted.size() < 3) {
			return sorted.get(0);
		} else {
			return sorted.get(2);
		}
	}
}
