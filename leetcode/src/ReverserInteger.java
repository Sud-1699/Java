public class ReverserInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        long reverse = 0;
        boolean negative = false;

        if(x < 0) {
            x = x * -1;
            negative = true;
        }

        while(x > 0) {
            int digit = x % 10;
            reverse = (reverse * 10) + digit;

            x /= 10;
        }

        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) reverse * (negative ? -1 : 1);
        }
    }
}
