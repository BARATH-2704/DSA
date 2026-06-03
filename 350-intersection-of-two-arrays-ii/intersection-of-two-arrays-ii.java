class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0;i<nums1.length;i++){
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }
        for(int i:nums2){
            if(map.containsKey(i)){
                if(map.get(i)!=0){
                    map.put(i,map.get(i)-1);
                    arr.add(i);
                }
            }
        }
        int ar[] = new int[arr.size()];
        int k=0;
        for(int i:arr){
            ar[k] = i;
            k++;
        }   
        return ar;     
    }
}