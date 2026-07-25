class Solution {
    public int lengthOfLastWord(String s) {
        int wordCount = 0;
        for (int j = s.length() - 1; j>=0; j--){
            if(s.charAt(j) != ' '){
                wordCount++;
            }else if(s.charAt(j) == ' ' && wordCount > 0){
                return wordCount;
            }
        }
        return wordCount;
    }
}