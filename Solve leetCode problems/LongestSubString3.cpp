//
//  LongestSubString3.cpp
//  
//
//  Created by Shubham Jana on 17/07/26.
//
#include <iostream>
#include <string>
using namspace std;

class Solution(object):
    def lengthOfLongestSubstring(self, s):
        temp = ""
        end = len(s) - 1
        start = 0
        current = 0
        count = 0
        max_count = 1
        while(current < len(s)):
            # if(s[current] == s[end] and s[current] != s[current - 1] and current > 0):
            #     count += 1
            if(s[current] in temp):
                start += 1
                # count -= 1
            # if(s[start] == s[current]):
            #     count -=1
            elif(s[current] not in temp):
                temp = temp + s[current]
                count +=1
            elif((count >= max_count) and ((len(temp) < len(s)) and (count > 0))):
                count -= 1
                max_count = count
                start = s.find(s[current])
            else:
                break
            if(count >= max_count):
                max_count = count
            current += 1
        return max_count
            
       
