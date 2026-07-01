'''
# Search for a number x in this tuple using loop:
t = (1,4,9,16,25,36,49,64,81,100)
x = 36
i = 0
while i < len(t):
    if t[i] == x:
        print(t[i])
    else:
        print("not found")
    i+=1
'''
# print the Following elements of the list using for loop.
'''
my_list = [1,4,9,16,25,36,49,64,81,100]
for i in my_list:
    print(i) 
'''
# find out a given number from the following list.
"""
my_list = [1,4,9,16,25,36,49,64,81,100,49]
t = 49
for ind in range(len(my_list)):
    if (my_list[ind] == t):
        print(f"at index number,{ind} we can find",t)
"""
# another way..
"""
my_list = [1,4,9,16,25,36,49,64,81,100,49]
t = 49
for ind, i in enumerate(my_list):
    if (i == t):
        print(f"at index number,{ind} we can find",t)
"""

