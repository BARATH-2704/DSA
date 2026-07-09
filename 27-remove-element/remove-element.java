class Solution {
    public int removeElement(int[] nums, int val) {
        int slow =0;
        if(nums.length == 0) return 0;
        else{
            for(int fast =0;fast<nums.length;fast++){
                if(nums[fast]== val){
                    continue;
                }
                else{
                    nums[slow]=nums[fast];
                    slow++;
                }
            }
        }
        return slow;
    }
}