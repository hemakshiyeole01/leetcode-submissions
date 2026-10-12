class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> ind=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(ind.containsKey(comp)){
                return new int[]{ind.get(comp),i};
            }
            ind.put(nums[i],i);
        }
        return new int[]{,};
    }
}