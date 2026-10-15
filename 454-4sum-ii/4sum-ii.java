class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int n1:nums1){
            for(int n2:nums2){
                int sum=n1+n2;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        int cnt=0;
        for(int n3:nums3){
            for(int n4:nums4){
                int sum=n3+n4;
                cnt+=map.getOrDefault(-sum,0);
            }
        }
        return cnt;
    }
}
