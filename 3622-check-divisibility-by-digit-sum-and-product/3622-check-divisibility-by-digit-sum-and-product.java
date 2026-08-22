class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int sum = 0;
        int prod = 1;
        while(num != 0){
            sum = sum+num%10;
            prod = prod * (num%10);
            num = num/10;
        }
        if(n%(sum+prod) == 0){
            return true;
        }else{
            return false;
        }

    }
}