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
f = (10, 20, 4, 30)
h = 4
i = 0
while i < len(f):
    if(f[i] == 4):
        break
    print(f[i])
    i += 1