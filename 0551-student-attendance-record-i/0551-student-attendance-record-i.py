class Solution(object):
    def checkRecord(self, s):
        lc = 0
        ac = 0
        for i in s:
            if(i == 'A'):
                ac += 1
            elif(i == 'L'):
                lc += 1
        if(ac < 2 and "LLL" not in s):
            return True
        else:
            return False
        