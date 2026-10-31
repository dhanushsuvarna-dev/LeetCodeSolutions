class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int high = Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(high<candies[i]){
                high = candies[i];
            }
        }
        for(int candy: candies){
           if(candy+extraCandies >= high){
            result.add(true);
           }else{
            result.add(false);
           }
        }
        return result;
    }
}