class Solution {
    public boolean detectCapitalUse(String word) {
        boolean flagl = true;
        boolean flagu = false;
        if(word.toUpperCase() == word || word.toLowerCase() == word){
            return true;
        }
        int index = 0;
        for(char c : word.toCharArray()){
            //char k = word.charAt(j);
            if(index > 0 && Character.isUpperCase(c)){
               return false;
            }
            index++;
        }
        return flagl;
    }
}