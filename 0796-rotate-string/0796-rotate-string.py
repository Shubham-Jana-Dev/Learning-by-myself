class Solution(object):
    def rotateString(self, s, goal):
        if(len(s) != len(goal)):
            return False
        my_string = s + s
        if(goal in my_string):
            return True
        return False
        