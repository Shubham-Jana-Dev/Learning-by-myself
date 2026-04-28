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
# Logic to find a Triple Sum
arr = [1,2,3,4,5,6,7,8,9]
left = 0
right = len(arr) -1
target = 10
arr.sort()
for i in range(len(arr)-2):
    if i>0 and arr[i] == arr[i -1]:
        continue
    current_target = target - arr[i]
    left = i + 1
    right = len(arr) - 1
    while(left<right):
        current_sum = arr[left] + arr[right]
        if (current_sum == current_target):
            print(f"Found: {arr[i]}, {arr[left]}, {arr[right]}")
            left += 1
            right -= 1
        elif(current_sum<current_target):
            left += 1
        else:
            right -= 1