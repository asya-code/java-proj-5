/*
Imagine a list of numbers from 1 to max_num, inclusive -
except that one of these numbers will be missing from the list.

Write a function that takes this list of numbers, as well as
the max_num, and it should return the missing number.

For example, given a list of numbers, in random order, of 1…10, 8 was removed.
If this list and the maxNum of 10 was passed into the function,
it would return 8: missingNumber({2, 1, 4, 3, 6, 5, 7, 10, 9}, 10) ⇒ 8

If there is no missing number, the function should return 0.
 */

import java.util.*;

public class MissingNumber {
    public static void main(String[] args){
        int[] testList = {4, 0, 1, 2, 5, 3};
        int result1 = findMissingNum1(testList);
        int result2 = findMissingNum2(testList);

        System.out.println("findMissingNum1: " + result1);
        System.out.println("findMissingNum2: " + result2);

    }
    public static int findMissingNum1(int[] nums) {
        /*
        Time complexity : O(nlgn)
        Space complexity : O(1) or O(n)
         */
        Arrays.sort(nums);
        if (nums[0] != 0) {
            return 0;
        }
        var size = nums.length;
        if (nums[size - 1] != size) {
            return nums.length;
        }

        for (var i = 0; i < size; i++) {
            var temp = nums[i] + 1;
            if (temp != nums[i+1]){
                return temp;
            }
        }
        return -1;
    }

    public static int findMissingNum2(int[] nums) {
         /*
        Time complexity : O(n)
        Space complexity : O(n)
         */
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int temp = nums.length + 1;
        for (int number = 0; number < temp; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }
}
