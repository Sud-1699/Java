public class LongestSubstringPalindrome {
    public static void main(String[] args) {
        String s = "cbbd";

        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        int l = 0, h = s.length();

        while (l <= h) {
            if(l == h) {
                l++;
                h = s.length();
                continue;
            }

            String substring = s.substring(l, h);
            StringBuilder reverse = new StringBuilder(substring).reverse();

            if(substring.contentEquals(reverse)) {
                return true;
            }

            h--;
        }

        return false;
    }

    static boolean isPalindromeV2(String s) {
        int l = 0, h = s.length() - 1;

        while (l <= h) {
            if(l == h) {
                l++;
                h = s.length();
                continue;
            }

            char c1 = s.charAt(l);
            char c2 = s.charAt(h);

            if(c1 == c2) {
                l++;
                h--;
            } else {
                h--;
            }
        }

        return false;
    }
}
