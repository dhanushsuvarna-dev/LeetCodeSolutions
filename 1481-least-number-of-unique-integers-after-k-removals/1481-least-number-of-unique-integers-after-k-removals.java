class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int[] freq = new int[mp.size()];
        int i = 0;

        for(int count: mp.values()){
            freq[i++] = count;
        }

        Arrays.sort(freq);

        int unique = mp.size();

        for(int count: freq){
            if(k >= count){
                k -= count;
                unique--;
            }else{
                break;
            }
        }
        return unique;
    }
}