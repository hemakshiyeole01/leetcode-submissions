class Solution {
    public int missingInteger(int[] nums) {
        int sum = 0;
        sum+=nums[0];
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] == nums[j - 1] + 1) {
                sum += nums[j];
            } else {
                break;
            }
        }
        while (inArray(nums, sum)) {
            sum += 1;
        }
        return sum;
    }

    public boolean inArray(int[] nums, int x) {
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == x) {
                return true;
            }
        }
        return false;
    }
}