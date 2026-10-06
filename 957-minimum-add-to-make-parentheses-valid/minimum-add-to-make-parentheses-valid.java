class Solution {
    public int minAddToMakeValid(String s) {
        int open= 0, close=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '(':open++;
                break;
                case ')':if(open>0){
                    open--;
                }else{
                    close++;
                }
                break;
                default: return 0;
            }
        }
        return (open+close);
    }
}