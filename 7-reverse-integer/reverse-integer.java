class Solution {
    public int reverse(int x) {

        int rev = 0;

        while (x != 0) {

            // Last digit
            int digit = x % 10;

            // Check overflow before rev * 10 + digit
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            // Add digit to reverse
            rev = rev * 10 + digit;

            // Remove last digit from x
            x = x / 10;
        }

        return rev;
    }
} 
