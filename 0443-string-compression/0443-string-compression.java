
class Solution {
    public int compress(char[] chars) {
        StringBuilder ans = new StringBuilder();
        int j = 0;

        while (j < chars.length) {
            char start = chars[j];
            ans.append(start);

            int count = 1;
            int i = j + 1;

            while (i < chars.length && chars[i] == start) {
                count++;
                i++;
            }

            if (count > 1) {
                ans.append(count);
            }

            j = i;
        }

        for (int i = 0; i < ans.length(); i++) {
            chars[i] = ans.charAt(i);
        }

        return ans.length();
    }
}
