class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int i : nums1){
            set.add(i);
        }
        for(int i:nums2){
            if(set.contains(i)){
                res.add(i);
            }
        }
        int arr[] = new int[set.size()];
        int k=0;
        for(int i:res){
            arr[k] = i;
            k++;
        }
        return Arrays.copyOfRange(arr, 0, res.size());
    }
}