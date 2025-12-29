# Search for a number x in this tuple using loop:
t = (1,4,9,16,25,36,49,64,81,100)
x = 494
i = 0
found = False
while i < len(t):
    if t[i] == x:
        print("The number is found at index: ",i)
        found = True
        break
    i+=1
if found == False:
    print("Not found")