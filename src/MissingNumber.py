def missingNumber1(nums):
    nums.sort()
    if nums[0] != 0:
        return 0
    if nums[-1] != len(nums):
        return len(nums)

    for i in range(len(nums)):
        temp = nums[i] + 1
        if temp != nums[i+1]:
            return temp

def missingNumber2(nums):
    nums_set = set(nums)
    for i in range(len(nums) + 1):
        if i not in nums_set:
            return i