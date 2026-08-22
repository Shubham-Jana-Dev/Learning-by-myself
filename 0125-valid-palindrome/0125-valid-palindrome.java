class Solution {
    public boolean isPalindrome(String s) {
        String newString = "";
        String revString = "";
        for(int j = 0;j<s.length();j++){
            char ch = Character.toLowerCase(s.charAt(j));
            if(Character.isLetterOrDigit(ch)){
                newString = newString + ch;
                revString = ch + revString;
            }
        }
        if(newString.equals(revString)){
            return true;
        }else{
            return false;
        }
    }
}