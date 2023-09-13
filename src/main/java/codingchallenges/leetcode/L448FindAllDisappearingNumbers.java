package codingchallenges.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L448FindAllDisappearingNumbers {

	public static void main(String[] args) {

		int[] nums = { 10, 2, 5, 10, 9, 1, 1, 4, 3, 7 };
		List<Integer> resultList = findDisappearedNumbers(nums);
		System.out.println(resultList.toString());
	}

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> missingValues = new ArrayList<>();
		// [10,2,5,10,9,1,1,4,3,7]
		// [1,1,2,3,4,5,7,9,10,10]
		// [1,2,3,4,5,7,9,10]
		// Idea is to iterate over each value in the array and mark the value at whatever that index is with a negative.
		// Then we iterate over our array again and anything that was not marked negative didn't have a value in the array and is missing.

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1; // minus 1 to get 0-base index value
			if (nums[index] < 0) {
				continue;
			} else {
				nums[index] *= -1;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				missingValues.add(i + 1);
			}
		}
		return missingValues;
	}
}
    /*
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingList = new ArrayList<>();
        Arrays.sort(nums);
        // [4,3,2,7,8,2,3,1]
        // [1,2,2,3,3,4,7,8]
        for (int i = 0; i < nums.length; i++) {
            int compareValue = i + 1;
            if (nums[i] == compareValue) {
                continue;
            } else {
                boolean valueFound = false;
                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == compareValue) {
                        valueFound = true;
                    }
                }
                if (!valueFound) {
                    missingList.add(compareValue);
                }
            }
        }
        return missingList;
    }
    */

    /*
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        //List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for (int i = 1; i <= nums.length; i++) {
                list.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            list.remove(Integer.valueOf(nums[i]));
        }
        return list;
    }
    */

    /*
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingValues = new ArrayList<>();
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for (int i = 1; i <= nums.length; i++) {
            if (!list.contains(i)) {
                missingValues.add(i);
            }
        }
        return missingValues;
    }
    */

	// Two Options:
	// 1: Create missingValues with all values between 1 and nums.length and remove values from this list each time we come across one in nums  (Also errored out with too much time)
	// 2: Iterate over each value in nums and if that i value doesn't exist, add it to missingValues (This option errors out with too much time taken)
	// 3: Sort the array, iterate over it and add missing values to a new array