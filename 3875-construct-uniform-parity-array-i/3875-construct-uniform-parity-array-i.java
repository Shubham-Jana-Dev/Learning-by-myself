class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean AllEven = true;
        boolean AllOdd = true;
        boolean result = true;
        for (int i : nums1) {
            if (i % 2 != 0) {
                AllEven = false;
            }
        }

        if (AllEven != true) {
            for (int j : nums1) {
                if (j % 2 == 0) {
                    AllOdd = false;
                }
            }
            if(AllOdd == true){return true;}
        }else{
            return true;
        }
        return result;
    }
}