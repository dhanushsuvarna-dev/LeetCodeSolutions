class Solution {

    public int strStr(String haystack, String needle) {

        int loc = 0, length = 0;

        if (haystack.length() >= 1 && needle.length() >= 1 &&
            haystack.length() <= 10000 && needle.length() <= 10000) {

            int[] arr = new int[needle.length()];

            for (int i = 0; i < haystack.length(); i++) {

                loc = 0;
                length = 0;

                for (int j = i; j < haystack.length() && loc < needle.length(); j++) {

                    if (haystack.charAt(j) == needle.charAt(loc)) {
                        arr[length] = j;
                        length++;
                        loc++;
                    } else {
                        break;
                    }
                }

                if (length == needle.length()) {
                    return arr[0];
                }
            }
        }

        return -1;
    }
}