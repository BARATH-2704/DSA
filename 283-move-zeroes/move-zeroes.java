class Solution {
    public void moveZeroes(int[] nums) {
            int slow =0;
            for(int fast =0;fast<nums.length;fast++){
                if(nums[fast]== 0){
                    continue;
                }
                else{
                    int temp = nums[slow];
                    nums[slow] = nums[fast];
                    nums[fast]=temp;
                    slow++;
                }
            }
            System.out.print("[");
            for(int i =0;i<nums.length;i++){
                System.out.print(nums[i]);
            }
            System.out.print("]");
    }
}