class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2 != 0){
            return false;
        }
        int uCount = 0;
        int dCount = 0;
        int lCount = 0;
        int rCount = 0;
        for(int i = 0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U'){
                uCount++;
            }else if(moves.charAt(i) == 'D'){
                dCount++;
            }else if(moves.charAt(i) == 'L'){
                lCount++;
            }else if(moves.charAt(i) == 'R'){
                rCount++;
            }
        }
        if(uCount == dCount && rCount == lCount){
            return true;
        }else{
            return false;
        }
    }
}