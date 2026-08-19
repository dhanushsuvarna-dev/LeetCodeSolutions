class Solution {

    public boolean isAnagram(String s, String t) {

        int[] count = new int[26];

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            int j = s.charAt(i) - 'a';
            count[j]++;
        }

        for(int i = 0; i < t.length(); i++) {
            int j = t.charAt(i) - 'a';
            count[j]--;
        }

        for(int i = 0; i < count.length; i++) {
            if(count[i] != 0) {
                return false;
            }
        }

        return true;
    }
}