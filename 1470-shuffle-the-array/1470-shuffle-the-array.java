class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] r1 = new int[n];
        int[] r2 = new int[n];
        int[] result = new int[2*n];
        for(int j = 0; j < n;j++){
            r1[j] = nums[j];
        }
        int t = 0;
        for(int k = n; k < 2*n; k++){
            r2[t] = nums[k];
            t++;
        }
        int t1 = 0;
        int t2 = 0;
        for(int i = 0; i < 2*n;i++){
            if(i%2 == 0){
                result[i] = r1[t1];
                t1++;
            }else{
                result[i] = r2[t2];
                t2++;
            }
        }
        return result;
    }
}