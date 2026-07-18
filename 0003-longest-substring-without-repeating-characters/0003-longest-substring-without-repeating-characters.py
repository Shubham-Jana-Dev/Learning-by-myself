class Solution(object):
    def lengthOfLongestSubstring(self, s):
        temp = ""
        
        start = 0
        current = 0
        count = 0
        max_count = 0
        if(len(s) == 0):
            return 0
        while(current < len(s)):
            
            if(s[current] not in temp):
                temp = temp + s[current]
                count +=1

            elif(s[current] in temp):
                
                start = temp.find(s[current]) 
                temp = temp[start+1:]
                count = len(temp) + 1
                temp = temp + s[current]
            
            if(count > max_count):
                    max_count = count
            current += 1
        return max_count
            
       