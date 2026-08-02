class Solution {
    public boolean judgeSquareSum(int c) {
        long limit = (long) Math.sqrt(c);
        long start = 0;
        while(start <= limit){
            long sum = start*start + limit*limit;
            if(sum == c){
                return true;
            }else if(sum > c){
                limit--;
            }else{
                start++;
            }
        }
        
        return false;
    }
}