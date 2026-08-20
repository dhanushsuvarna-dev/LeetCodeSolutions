class Solution {
    public int firstUniqChar(String s) {
        if(s.length()>=1&&s.length()<=100_000){
       int[] index = new int[26];
       for(int i=0;i<s.length();i++){
        int j=s.charAt(i)-'a';
        index[j] +=1;
       }
       for(int i=0;i<s.length();i++){
        int j=s.charAt(i)-'a';
        if(index[j]==1){
            return i;
        }
       }
        }
       return -1;
    }
}