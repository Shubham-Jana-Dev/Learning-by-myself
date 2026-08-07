class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase() == word || word.toLowerCase() == word){
            return true;
        }
        int index = 0;
        for(char c : word.toCharArray()){
            if(index > 0 && Character.isUpperCase(c)){
               return false;
            }
            index++;
        }
        return true;
    }
}