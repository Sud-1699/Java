public class TwoPointer {

    /*
    * Idea
    * Use two indices to traverse a data structure (usually an array or string).
    * Time complexity: O(n)
    * */

    /*
    * When to Use
    * * Sorted arrays
    * * Pair problems
    * * Palindrome checking
    * * Removing duplicates
    * */

    // Check if a string is palindrome.
    private boolean isPalindrome(String s) {
        // given value madam
        // Create two indices pointer left starting at O idx whereas right at last idx
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        TwoPointer twoPointer = new TwoPointer();
        System.out.println("Palindrome: " + twoPointer.isPalindrome("madam"));
    }
}
