class Solution {
    public String getHint(String secret, String guess) {
        int b=0;
        int c=0;
        int[]n=new int[10];
        for(int i=0;i<secret.length();i++){
            int s= secret.charAt(i)-'0';
            int g= guess.charAt(i)-'0';
            if(s==g){
                b++;
            }else{
                if(n[g]-->0){
                    c++;
                }
                if(n[s]++<0){
                    c++;
                }
            }
        }
        return b+"A"+c+"B";
    }
}