public class DivideTwoIntegers {
    public static void main(String[] args) {
        DivideTwoIntegers test = new DivideTwoIntegers();
        System.out.println(test.divide(7, -3));
    }

    public int divide(int dividend, int divisor) {
        boolean negative = (dividend < 0) ^ (divisor < 0);
        if(dividend < 0) {
            dividend *= -1;
        }
        if(divisor < 0){
            divisor *= -1;
        }

        int quotient = 0;
        while(dividend >= divisor) {
            int shift = 0;
            while(dividend >= (divisor << (shift + 1)))
                shift += 1;

            quotient += (1 << shift);
            dividend -= (divisor << shift);
        }

        return (negative ? -1 : 1) * quotient;
    }
}
