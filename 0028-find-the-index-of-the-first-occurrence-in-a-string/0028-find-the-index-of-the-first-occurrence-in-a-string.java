class Solution {
    public int strStr(String haystack, String needle) {
        int count = -1;
        String tempString = "";
        if(haystack.contains(needle)){
            for(int i = 0; i<haystack.length(); i++){
                tempString = tempString + haystack.charAt(i);
                count++;
                if(tempString.contains(needle)){
                    count = tempString.length() - needle.length();
                    break;
                }
            }
        }
        return count;
    }
}