# 0+1 1+1 2+4
# Calculate Fibonacci series
ra = int(input("Enter the range: "))
if(ra<=1):
    print(ra)
else:
    prev2 = 0
    prev1 = 1
    for i in range(2,ra+1):
        curr = prev1+prev2
        prev2 = prev1
        prev1 = curr
    print(curr,"\n")