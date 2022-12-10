'''
Imagine a list of numbers from 1 to max_num, inclusive -
except that one of these numbers will be missing from the list.

Write a function that takes this list of numbers, as well as
the max_num, and it should return the missing number.

For example, given a list of numbers, in random order, of 1…10, 8 was removed.
If this list and the maxNum of 10 was passed into the function,
it would return 8: missingNumber({2, 1, 4, 3, 6, 5, 7, 10, 9}, 10) ⇒ 8

If there is no missing number, the function should return 0.
'''
def missingNumber1(nums, maxNum):
    nums_set = set(nums)
    for i in range(1, maxNum + 1):
        if i not in nums_set:
            return i
    return 0

testList = [1,3,5,6,2,4,7,9,10]
print(missingNumber1(testList, 10))