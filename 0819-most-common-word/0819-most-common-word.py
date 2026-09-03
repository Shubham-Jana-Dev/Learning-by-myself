class Solution(object):
    def mostCommonWord(self, paragraph, banned):
        newPara = ""
        
        for j in paragraph:
            if j.isalpha():
                newPara = newPara + j.lower()
            else:
                newPara = newPara + " "

        
        word_list = newPara.split()

        w_f = {}
        for word in word_list:
            w_f[word] = w_f.get(word, 0) + 1

        for bn in banned:
            w_f.pop(bn, None)

        maxf = 0
        key = ""
        for k, v in w_f.items():
            if maxf < w_f[k]:
                maxf = w_f[k]
                key = k

        return key