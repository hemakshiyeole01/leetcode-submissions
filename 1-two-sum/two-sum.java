class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer,Integer> ind=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(ind.containsKey(comp)){
                ans[0]=ind.get(comp);
                ans[1]=i;
                return ans;
            }
            ind.put(nums[i],i);
        }
        return ans;
    }
}