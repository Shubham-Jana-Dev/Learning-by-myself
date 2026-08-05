class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        main = []
        for j in nums1:
            main.append(j)
        for k in nums2:
            main.append(k)
        main.sort()
        if(len(main)%2 != 0):
            return main[len(main)/2]
        else:
            return (main[len(main)//2 - 1] + main[len(main)//2])/2.0
        