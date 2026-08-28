class Solution {

    boolean isPalin(long n) {
        long original = n;
        long reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        return original == reverse;
    }

    public int superpalindromesInRange(String left, String right) {

        long l = Long.parseLong(left);
        long r = Long.parseLong(right);

        int count = 0;

        // Generate palindromic roots up to 1e9
        for (long i = 1; i <= 100000; i++) {

            String s = String.valueOf(i);

            // Odd-length palindrome
            String odd = s + new StringBuilder(s.substring(0, s.length() - 1))
                    .reverse();

            long root = Long.parseLong(odd);

            long square = root * root;

            if (square > r)
                break;

            if (square >= l && isPalin(square))
                count++;

            // Even-length palindrome
            String even = s + new StringBuilder(s).reverse();

            root = Long.parseLong(even);

            square = root * root;

            if (square > r)
                continue;

            if (square >= l && isPalin(square))
                count++;
        }

        return count;
    }
}