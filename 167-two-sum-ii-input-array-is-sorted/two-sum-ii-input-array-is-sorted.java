class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int slow =0;
        int fast =numbers.length-1;
        while(fast>=0){
            int sum = numbers[slow]+numbers[fast];
            if(target>sum){
                slow++;
                continue;
            }
            else if(target == sum) return new int[]{slow+1,fast+1};
            else fast--;
        }
        return new int[]{-1};
    }
}