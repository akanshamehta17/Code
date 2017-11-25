Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

//code
class Solution {
    int[] nums;
    int[] nums2 = new int[2];
    int target;
    boolean flag = false;
    
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length && !flag;i++){
            for(int j=1;j<nums.length && !flag;j++){
                if(i==j) continue;
                else if(nums[i]+nums[j] == target){
                    for(int k=0;k<1;k++){
                        nums2[k] = i;
                        nums2[k+1] = j;
                    }
                    flag = true;
                }
                
            }
        }
        return nums2;
    }
    
    public static void main(String[] args){
        int[] nums = {3,2,4};
        Solution s = new Solution();
        s.twoSum(nums,6);
    }
}
