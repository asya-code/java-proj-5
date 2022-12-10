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

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args){
        int[] testList = {4, 1, 2, 5, 3};
        int result1 = findMissingNum1(testList, 5);
        //int result2 = findMissingNum2(testList);

        System.out.println("findMissingNum1: " + result1);
        //System.out.println("findMissingNum2: " + result2);

    }
    public static int findMissingNum1(int[] nums, int maxNum){
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        for (int number = 1; number < maxNum; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return 0;
    }
}
