class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for(int i = 0; i<stones.length();i++){
            if(jewels.contains(String.valueOf(stones.charAt(i)))){
                result++;
            }
        }
        if(result != 0 ){
            return result;
        }
        return result;
    }
}