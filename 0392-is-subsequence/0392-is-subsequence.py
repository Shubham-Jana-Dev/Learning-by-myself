class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
    
        result = ""
        ptr = 0
        ptr2 = 0
        while(ptr < len(s) and ptr2 < len(t)):
            if(s[ptr] == t[ptr2]):
                result = result + t[ptr2]
                ptr += 1
                ptr2 += 1
            else:
                ptr2 += 1
        if(result == s):
            return True
        else:
            return False
