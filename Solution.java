Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

//code with time complexity O(n^2)
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

//code with time complexity O(n)
class Solution {
    int[] nums;
    int[] nums2;
    //int[] nums2 = new int[2];
    int target;
    //boolean flag = false;
    
    public int[] twoSum(int[] nums, int target) {
        /*for(int i=0;i<nums.length && !flag;i++){
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
        return nums2;*/
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        
        for(int j=0;j<nums.length;j++){
            int val = target - nums[j];
            if(map.containsKey(val) && map.get(val)!=j){
                nums2 = new int[]{map.get(val),j};
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
