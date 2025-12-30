# understanding the topics of break and Continue 
'''
f = (1,3,2,4,5,6,7)
v = 5
i = 0
while i < len(f):
    if (i == v):
        i = i + 1
        continue
    print(f[i])
    i = i + 1
'''
# refactor: switch from index-based to value-based break
"""
f = (1, 3, 2, 4, 5, 6, 7, 8, 9, 10)
t = 4
idx = 0
while idx < len(f):
    if (idx == t):
        break
    print(f[idx])
    idx += 1
"""
"""
f = (10, 20, 4, 30)
h = 4
i = 0
while i < len(f):
    if(f[i] == 4):
        break
    print(f[i])
    i += 1
"""
"""
my_list = [1,4,9,16,25,36,49,64,81,100,49]
t = 49
for ind, i in enumerate(my_list):
    if (i == t):
        print(f"at index number,{ind} we can find",t)
"""
prices = [10, 20, 30, 40, 50]
t = 70
for i in range(len(prices)):
    for j in range(i+1, len(prices)):
        if prices[i] + prices[j] == t:
            print(f"the items prices would be {i} and {j}.")



















nums = [3, 2, 4]
target = 6
for i in range(len(nums)):
    for j in range(i+1,len(nums)):
        if target == nums[i] + nums[j]:
            print(i,j)

class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if target == nums[i]+nums[j]:
                    return[i,j]


"""
:type nums: List[int]
:type target: int
:rtype: List[int]
"""
                