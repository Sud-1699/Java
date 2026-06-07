import java.util.*;

public class Fibonacci {
    private static final Map<Integer, Integer> cache = new HashMap<>();
    private static int fibonacci(int n) {
        if(n <= 1) return n;

        if(cache.containsKey(n)) return cache.get(n);
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        cache.put(n, result);

        return result;
    }

    public static void main(String[] args) {
        int n = 20;
        int a = 0;
        int b = 1;

//        System.out.print(a + " ");
       /* for(int i = 0; i <= n; i++) {
            *//*int c = a + b;
            a = b;
            b = c;

            System.out.print(a + " ");*//*
            System.out.print(fibonacci(i) + " ");
        }*/

        /*String s = "madam";
        StringBuilder reverse = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse.append(s.charAt(i));
        }

        System.out.println(reverse);
        if(reverse.toString().equals(s)) {
            System.out.println("palindrome");
        }*/

        String s = "madam";
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                System.out.println(s.charAt(left));
                return;
            }

            left++;
            right--;
        }

        String input = "madam";
        Optional<Character> firstNonRepeated = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst();
        System.out.println(firstNonRepeated.orElse(null)); // Output: w

        Set<Integer> uniques = new HashSet<>();
        int[] nums = {3, 1, 2};
        int[] duplicates = Arrays.stream(nums)
                .filter(num -> !uniques.add(num))
                .toArray();

        System.out.println(duplicates.length > 0 ? Arrays.toString(duplicates) : -1);

        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        String str = "Hello";
        int left1 = 0, right1 = s.length() - 1;
        while(left1 < right1) {
            char temp = str.charAt(left1);
            if(vowels.contains(str.charAt(left1)) && vowels.contains(str.charAt(right1))) {
                str = str.replace(str.charAt(left1), str.charAt(right1));
                str = str.replace(str.charAt(right1), temp);

                left1++;
                right1--;
            } else {
                if(!vowels.contains(str.charAt(left1)))
                    left1++;
                else
                    right1--;
            }
        }

        System.out.println(str);

        String moves = "UD";
        int origin = 1;

        for(int i = 1; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    if(moves.charAt(i - 1) == 'D')
                        origin--;
                    else
                        origin++;
                    break;
                case 'D':
                    if(moves.charAt(i - 1) == 'U')
                        origin--;
                    else
                        origin++;
                    break;
                case 'R':
                    if(moves.charAt(i - 1) == 'L')
                        origin--;
                    else
                        origin++;
                    break;
                default:
                    if(moves.charAt(i - 1) == 'R')
                        origin--;
                    else
                        origin++;
                    break;
            }
        }

        System.out.println(origin == 0);
    }
}
