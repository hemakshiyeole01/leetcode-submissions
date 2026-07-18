class Solution {
    public int findGCD(int[] nums) {
        int max = 0;
        int min = 1000;
        for(int i = 0; i<nums.length ;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int gcd=1;
        for(int i=2; i< max*min; i++){
            if(max%i==0 & min%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}