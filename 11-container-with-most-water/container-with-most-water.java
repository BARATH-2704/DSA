class Solution {
    public int maxArea(int[] height) {
        int slow = 0;
        int fast = height.length -1;
        int ans =0;
        while(fast>=slow){
            ans = Math.max(ans,Math.min(height[fast],height [slow]) * (fast-slow));
            if(height[slow]>=height[fast]){
                fast--;
            }
            else{
            slow++;
            }
        }
        return ans;
    }
}