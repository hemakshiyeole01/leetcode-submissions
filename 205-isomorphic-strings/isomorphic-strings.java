class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] s1=s.toCharArray();
        char[] t1=t.toCharArray();
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<s1.length;i++){
            if(map.containsKey(s1[i])){
                if(map.get(s1[i])!=t1[i]){
                    return false;
                }
            }
            if(map.containsValue(t1[i])){
                if(!map.containsKey(s1[i])||map.get(s1[i])!=t1[i]){
                    return false;
                }
            }
            map.put(s1[i],t1[i]);
        }
        return true;
    }
}