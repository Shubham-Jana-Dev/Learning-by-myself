class Solution(object):
    def repeatedCharacter(self, s):
        new_str = ""
        for i in s:
            if(i in new_str):
                return i
            else:
                new_str = new_str + i
        