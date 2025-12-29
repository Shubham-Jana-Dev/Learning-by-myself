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