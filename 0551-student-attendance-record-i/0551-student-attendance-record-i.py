class Solution(object):
    def checkRecord(self, s):
        ac = 0
        for i in s:
            if(i == 'A'):
                ac += 1
        if(ac < 2 and "LLL" not in s):
            return True
        else:
            return False
        