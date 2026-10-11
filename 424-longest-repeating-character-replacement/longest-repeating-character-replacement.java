class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxFreq=0;
        int left=0;
        int maxWindow=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);
            int windowLen=right-left+1;
            while(windowLen-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
                windowLen=right-left+1;
            }
            maxWindow=Math.max(windowLen,maxWindow);
        }
        return maxWindow;
    }
}