class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        num1.add(nums[0]);
        num2.add(nums[1]);

        for(int j = 2; j<nums.length; j++){
            if(num1.get(num1.size()-1) > num2.get(num2.size()-1)){
                num1.add(nums[j]);
            }else{
                num2.add(nums[j]);
            }
        }
        int[] result = new int[num1.size() + num2.size()];
        int index = 0;
        for(int num : num1) result[index++] = num;
        for(int num : num2) result[index++] = num;
        // for (int num : num1) result[index++] = num;
        // for (int num : num2) result[index++] = num;
        return result;
    }
}