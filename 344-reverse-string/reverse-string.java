class Solution {
    public void reverseString(char[] s) {
        if(s.length>=1&&s.length<=100_000){
        for(int i=0;i<s.length/2;i++){
            char temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;
        }
        }
    }
}