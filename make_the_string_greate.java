// leetcode 1544
class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int i =0;
        if(s.length()<=1){
            return s;
        }
        while(i< sb.length() -1){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(i+1);
            if(ch1 + 32 == ch2 || ch2 + 32 == ch1){
                                 sb.delete(i,i+2);
                if(i >0){
                 i = i-1;

                }
            }else{
                i++;
            }
        }

        return sb.toString();
    }
}
