class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String common = strs[0];

        for (int i = 0; i < common.length(); i++) {

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() ||
                    common.charAt(i) != strs[j].charAt(i)) {

                    return common.substring(0, i);
                }
            }
        }

        return common;
    }
}