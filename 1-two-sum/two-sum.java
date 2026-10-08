class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int i = 0;
        for (int j = 1; j < nums.length && i < nums.length; j++) {
            if (nums[i] + nums[j] == target && i!=j) {
                ans[0] = i;
                ans[1] = j;
                break;
            }
            if (j == nums.length - 1) {
                j = 1;
                i++;
            }
        }
        return ans;
    }
}