class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j = 0;
        
        if(nums.length==0){
            return 0;
        }
         
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        
        System.out.println(j);
        return j;
    }
}
