public class FinallyDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Step 1: Try block starts.");
            int data = 10 / 0; // Change to 10 / 0 to see the error path
            System.out.println("Step 2: Try block completes.");
        } catch (ArithmeticException e) {
            System.out.println("Step 3: Catch block handles error.");
        } finally {
            System.out.println("Step 4: Finally block always runs!");
        }
        System.out.println("Step 5: Program continues.");
    }
}