class Solution {
    public boolean judgeSquareSum(int c) {
        boolean result = false;
        
        long limit = (long) Math.pow(c,0.5);
        long start = 0;
        while(start <= limit){
            if(((long) Math.pow(start,2) + (long) Math.pow(limit,2)) == c){
                result = true;
                break;
            }else if(((long) Math.pow(start,2) + (long) Math.pow(limit,2)) > c){
                limit--;
            }else{
                start++;
            }
        }
        
        return result;
    }
}