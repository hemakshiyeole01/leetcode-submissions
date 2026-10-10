class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result=new HashSet<>();
        if(nums.length<3){
            return new ArrayList<>();
        }
        for(int i=0;i<nums.length-2;i++){
            if (nums[i] > 0) break;
            int left=i+1;
            int right=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}