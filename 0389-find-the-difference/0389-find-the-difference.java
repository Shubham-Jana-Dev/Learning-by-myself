class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        int lenT = t.length();
        int lenS = s.length();
        //int loopCount = lenT*lenT;
        for(int j = 0; j<lenS; j++){
            result = result ^ ((int) s.charAt(j) ^ (int) t.charAt(j));
        }
        result = result ^ (int) t.charAt(lenT-1);
        return (char) result;
    }
}