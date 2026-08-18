public class NumberAfterADoubleReversal {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
    }

    public static boolean isSameAfterReversals(int num) {
        if(num == 0) return true;

        int reverse = 0;
        int k = 0;
        int temp = num;
        while(k < 2) {
            while(temp > 0) {
                int digit = temp % 10;

                reverse = (reverse * 10) + digit;
                temp /= 10;
            }

            temp = reverse;
            reverse = 0;
            k++;
        }

        if(temp == num) return true;

        return false;
    }
}
