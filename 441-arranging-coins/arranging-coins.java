class Solution {
    public int arrangeCoins(int n) {
        int count = 0, step = 1;
        if(n>=1&&n<=Integer.MAX_VALUE){
            while(n>=step){
            n=n-step;
            count++;
            step++;
       }
    }
       return count;
    }
}