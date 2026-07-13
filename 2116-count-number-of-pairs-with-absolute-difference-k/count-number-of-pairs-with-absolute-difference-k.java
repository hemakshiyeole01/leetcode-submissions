class Solution {
    public int countKDifference(int[] nums, int k) {
        int l = 0;
        int count = 0;
        int r = 1;
        while (r < nums.length) {
            if (Math.abs(nums[l] - nums[r]) == k) {
                count++;
            }
            if(r+1 < nums.length){
                r++;
            }else{
                l++;
                r=l+1;
            }
        }
        return count;
    }
}