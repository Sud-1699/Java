public class StringToIntegerATOI {
    public static void main(String[] args) {
        System.out.println(myAtoi("0-1"));
    }

    public static int myAtoi(String s) {
        int result = 0;
        boolean negative = false;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ' || c == '0')
                continue;

            if(c == '-') {
                negative = true;
                continue;
            }

            int digit = c - '0';
            if(digit > 9)
                break;

            result = (result * 10) + digit;
        }

        return (result * (negative ? -1 : 1));
    }
}
