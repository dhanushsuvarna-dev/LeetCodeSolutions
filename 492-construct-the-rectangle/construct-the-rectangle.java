class Solution {
    public int[] constructRectangle(int area) {
        if(area>=1&&area<=10_000_000){
        int W = (int) Math.sqrt(area);

        while (area % W != 0) {
            W--;
        }

        int L = area / W;

        return new int[]{L, W};
        }
        return new int[]{0,0};
    }
}