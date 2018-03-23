class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = nums[0];
        int max = sum;
        
        for(int i=1;i<nums.length;i++){
            sum = nums[i] + (sum > 0 ? sum : 0);
            max = Math.max(max, sum);
        }
        
        return max;
    }
}
