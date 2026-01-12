# The dubble sum problem..
'''
arr = [1,2,3,4,5,6,7,8,9]
left = 0
right = len(arr) -1
target = 8
while(left<right):
    current_sum = arr[left] + arr[right]
    if (current_sum == target):
        print(left,right)
        left += 1
        right -= 1
    elif(current_sum<target):
        left += 1
    else:
        right -= 1
'''