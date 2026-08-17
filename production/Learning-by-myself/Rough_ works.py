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
"""
prices = [10, 20, 30, 40, 50]
t = 70
for i in range(len(prices)):
    for j in range(i+1, len(prices)):
        if prices[i] + prices[j] == t:
            print(f"the items prices would be {i} and {j}.")

"""
# Print numbers from 1 to 100
'''
for i  in range (1,101):
    print (i)
'''
'''
# print numbers from 100 to 1
for i in range (100,0,-1):
    print (i)
'''
# The same problem using while Loop
'''
I = 100
while I >= 1 :
    print (I)
    I-= 1
'''
# Only print even numbers 
'''
i = 100
while i>=1:
    if(i%2==0):
       print (i)
    i -=1
'''
# without if-elif-else 
'''
i = 100
while i>=1:
    print (i)
    i -=2
'''
# for odd numbers
'''
i=99
while i>=1:
    print (i)
    i-=2
 '''
 # the numbers those are only divisible by 5
''' 
i=100
while i>=1:
     print (i)
     i-=5
'''
# take the Input from the user of the starting value and using the range() function 
'''
i=int(input("Enter the number:- "))
for i in range(i,0,-5):
    print(i)
'''
"""
i=int(input("Enter the number:-"))
while i>=1:
    print (i)
    i-=5
"""
# Leet code problems
"""
nums = [3, 2, 4]
target = 6
for i in range(len(nums)):
    for j in range(i+1,len(nums)):
        if target == nums[i] + nums[j]:
            print(i,j)
"""
# leet code problem 2 sum.
"""
class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if target == nums[i]+nums[j]:
                    return[i,j]
"""
# 1. creat a dummy node and a carry variable

# 2. start loop
'''
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        dummy = ListNode(0)
        current = dummy
        carry = 0
        while l1 or l2 or carry:
            dummy = ListNode(0)
            current = dummy
            carry = 0
    # taking value from l1 and l2 (if they are not ended)
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0
    
    # method of calulating the sum and the valu of the carry
            total = v1 + v2 + carry
            carry = total // 10    # it returns the whole number as remainder (example: 13 // 10 = 1)
            val = total % 10       # it returns the remainder (example: 13 % 13 = 3)
    
    # 3. add new node after creating it
            current.next = ListNode(val)
    
    # 4. set pu the pointers
            current = current.next
            if l1: l1 = l1.next
            if l2: l2 = l2.next

# 5. finaly return the next part of the dummy
        return dummy.next
'''
"""
print(121 // 10)
# palindroms numbers
x = 121
original = x
reversed_num = 0
while  x > 0:
    last_digit = x % 10
    reversed_num = (reversed_num * 10) + last_digit
    x = x // 10
if original == reversed_num:
    print("This is a palinrom number")
"""
#66. plus one
'''
my_list = [1,5,3,5,7]
for i in range(len(my_list) - 1, -1, -1):
    if my_list[i] < 9:
        my_list[i] = my_list[i]+1
    else:
        my_list[i] = 0
        my_list[i] = my_list[i-1]+1
'''
#26.

class Solution(object):
    def removeDuplicates(self, nums):
        if not nums:
            return 0
        
        write_index = 1 
        
        for i in range(1, len(nums)):
            if nums[i] != nums[i-1]:
                nums[write_index] = nums[i]
                write_index += 1
                
        return write_index




