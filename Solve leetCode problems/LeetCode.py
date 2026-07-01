class Solution(object):
    def isPalindrome(self, x):
        original = x
        reversed_num = 0
        if x < 0:
            return False
        while x > 0:
            last_digit = x % 10
            reversed_num = (reversed_num * 10) + last_digit
            x = x // 10
        return original == reversed_num
