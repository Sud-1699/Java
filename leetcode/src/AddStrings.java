public class AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("456", "77"));
    }

    public static String addStrings(String num1, String num2) {
        String add = "";
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;

        while(i >= 0 || j >= 0) {
            int sum = 0;
            if(i >= 0 && j >= 0) {
                sum = num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry;
            } else if(i >= 0) {
                sum = num1.charAt(i) - '0' + carry;
            } else {
                sum += num2.charAt(j) - '0' + carry;
            }

            carry = 0;
            if(sum >= 10) {
                carry = sum / 10;
                sum = sum % 10;
            }

            add = sum + add;
            i--;
            j--;
        }

        return add;
    }
}
