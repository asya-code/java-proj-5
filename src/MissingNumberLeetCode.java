/*
Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.

Example 1:

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are
in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
Example 2:

Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are
in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are
in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

Constraints:

n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
 */


import java.util.*;

public class MissingNumberLeetCode {
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
