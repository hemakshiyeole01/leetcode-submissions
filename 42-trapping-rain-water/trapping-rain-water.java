class Solution {
    public int trap(int[] height) {
        int i = 0, j = height.length - 1;
        int water = 0,h = 0;
        while (i != j) {
            int k = height[i] <= height[j] ? i++ : j--;
            h = Math.max(h, height[k]);
            water += h - height[k];
        }
        System.gc();
        return water;
    }
}