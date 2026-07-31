class Solution(object):
    def findWords(self, words):
        first_r = "QWERTYUIOP"
        second_r = "ASDFGHJKL"
        third_r = "ZXCVBNM"
        my_list = []
        for j in words:
            flag = 0
            for k in j:
                if(k.upper() in first_r and (flag == 1 or flag == 0)):
                    flag = 1
                elif(k.upper() in second_r and (flag == 2 or flag == 0)):
                    flag = 2
                elif(k.upper() in third_r and (flag == 3 or flag == 0)):
                    flag = 3
                else:
                    flag = -1
            if(flag != -1 and j):
                my_list.append(j)
                  
        return my_list



                    