class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for(int j = 0; j<s.length(); j++){
            result = result ^ ((int) s.charAt(j) ^ (int) t.charAt(j));
        }
        result = result ^ (int) t.charAt(t.length()-1);
        return (char) result;
    }
}