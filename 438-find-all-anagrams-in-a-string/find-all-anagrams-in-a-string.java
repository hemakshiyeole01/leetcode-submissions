
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> out = new ArrayList<>();

        if (p.length() > s.length()) {
            return out;
        }

        int[] pFreq = new int[26];
        int[] sFreq = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pFreq[p.charAt(i) - 'a']++;
        }

        for(int i=0;i<s.length();i++){
            sFreq[s.charAt(i)-'a']++;
            if(i>=p.length()){
                sFreq[s.charAt(i-p.length())-'a']--;
            }
            if(Arrays.equals(sFreq,pFreq)){
                out.add(i-p.length()+1);
            }
        }
        return out;
    }
}
