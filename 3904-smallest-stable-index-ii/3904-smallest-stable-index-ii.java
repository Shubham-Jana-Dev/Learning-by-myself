class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        // 1. Build suffix minimum array
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        // 2. Track prefix max and check instability score
        int prefixMax = nums[0];
        for (int i = 0; i < n; i++) {
            prefixMax = Math.max(prefixMax, nums[i]);
            
            // Score = max(nums[0..i]) - min(nums[i..n-1])
            int instabilityScore = prefixMax - suffixMin[i];
            
            if (instabilityScore <= k) {
                return i;
            }
        }

        return -1;
    }
}