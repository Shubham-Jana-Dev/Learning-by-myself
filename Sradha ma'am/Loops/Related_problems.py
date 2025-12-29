# t = (1, 4, 9, 4, 25, 4) and you are looking for x = 4? now find how many times 4 is appeared
t = (1, 4, 9, 4, 25, 4)
x = 4
count = 0
i  = 0
while i < len(t):
    if t[i] == x:
        count = count+1
    i = i+1
print("the count is: ",count)