class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] ans = new int[n*n];
        int miss=0, max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int num = grid[i][j];
                ans[num-1] += 1; 
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]==0)
                miss = i+1;
            else if(ans[i]>1)
                max = i+1;
        }
        return new int[]{max,miss};
    }
}