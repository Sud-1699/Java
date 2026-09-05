import java.util.List;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(new ReverseVowels().reverseVowels("aba"));
        System.out.println('A' - 'A');
    }

    public String reverseVowels(String s) {
        if(s.isBlank()) return s;
        if(s.length() == 1) return s;

        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int left = 0, right = s.length() - 1;

        char[] result = new char[s.length()];
        while(left <= right) {
            while(left < right && !vowels.contains(s.charAt(left))) {
                result[left] = s.charAt(left);
                left++;
            }

            while(right > left && !vowels.contains(s.charAt(right))) {
                result[right] = s.charAt(right);
                right--;
            }

            char temp = s.charAt(left);
            result[left] = s.charAt(right);
            result[right] = temp;

            left++;
            right--;
        }

        StringBuilder output = new StringBuilder();
        for(char c: result) {
            if(c == '\u0000') {
                output.append(" ");
                continue;
            }

            output.append(c);
        }

        return output.toString();
    }
}
