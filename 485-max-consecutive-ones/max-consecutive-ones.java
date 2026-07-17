class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int res = 0;
        int count =0;
        int l =0;
        for(int r = 0;r<n;r++){
            if(nums[r]==1){
                count++;
            }
            else{
                res = Math.max(res,count);
                count = 0;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}