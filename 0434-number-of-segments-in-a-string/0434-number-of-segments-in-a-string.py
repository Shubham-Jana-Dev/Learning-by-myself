class Solution(object):
    def countSegments(self, s):
        if(len(s) == 0):
            return 0
        count = 0
        my_list = s.split(" ")
        for j in my_list:
            if(j != ''):
                count += 1
        return count
        