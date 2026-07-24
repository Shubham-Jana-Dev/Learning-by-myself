class Solution {
    public int lengthOfLastWord(String s) {
        int wordCount = 0;
        int skippingCount = 0;
        boolean flag = false;
        for(int j = 0; j < s.length(); j++){
            if(s.charAt(j) != ' '){
                skippingCount ++;
                flag = true;
            }else{
                if(flag){
                wordCount = skippingCount;
                }
                skippingCount = 0;
                flag = false;
            }
        }
        if(s.charAt(s.length()-1) == ' '){
            return wordCount;
        }
        return skippingCount;
    }
}