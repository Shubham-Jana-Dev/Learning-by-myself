class Solution {
    public int numberOfSteps(int num) {
        int stepCount = 0;
        while(num != 0){
            if((num & 1) == 0) { num = num/2;}
            else{num = num -1;}
            stepCount++;
        }
        return stepCount;
    }
}