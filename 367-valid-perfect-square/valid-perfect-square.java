class Solution {
    public boolean isPerfectSquare(int num) {
        if(num >= 1 && num < Integer.MAX_VALUE) {
            int i = 1;
            while(i <= num / 2 + 1) {
                if(num == i * i) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }
}