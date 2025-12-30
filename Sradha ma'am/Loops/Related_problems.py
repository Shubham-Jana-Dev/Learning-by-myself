# t = (1, 4, 9, 4, 25, 4) and you are looking for x = 4? now find how many times 4 is appeared
"""
t = (1, 4, 9, 4, 25, 4)
x = 4
count = 0
i  = 0
while i < len(t):
    if t[i] == x:
        count = count+1
    i = i+1
print("the count is: ",count)
"""
# Challenge 3: The Multiples of Five Generate a sequence that starts at 50 and goes down to 0, decreasing by 5 each time.
"""
for i in range(50, -1, -5):
        print(i)
"""
#The Setup: my_list = [10, 20, 30, 40]
#The Goal: Print each number along with its position. Expected output: Position 0 holds 10 Position 1 holds 20 ...and so on.
"""
my_list = [10, 20, 30, 40]
for i in range(len(my_list)):
        print(my_list[i],"holds",i,"position")
"""
#🏆 The Final Boss Challenge: The Step-Skipper
#Now, let's combine everything I've learned today: Lists, len(), and the 3-argument range(start, stop, step).
#The Setup: numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
#The Goal: Print only the values at the even positions (Index 0, Index 2, Index 4...). Expected output: Position 0 holds 10 Position 2 holds 30 Position 4 holds 50 ... and so on.
"""
numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
i = 0
for i in range(0, len(numbers), 2):
    print(f"Position {i} holds", numbers[i])
"""
nums = [10, 20, 30]
for i in range(len(nums)):
    for j in range(len(nums)):
        f = nums[j] + nums[i]
        print(f)
# Calculate the sum of nums[i] and nums[j]
# Print it
