class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length - 1;
        while (mid <= end) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, mid, start);
                    start++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(nums, mid, end);
                    end--;
                    break;

            }
        }
    }

    public void swap(int[] nums, int left, int right) {
        int t = nums[left];
        nums[left] = nums[right];
        nums[right] = t;
    }
}