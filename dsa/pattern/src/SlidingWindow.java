class Expect {
    String name;

    Expect() {

    }

    Expect(String name) {
        this.name = name;
        System.out.println(name);
    }
}

public class SlidingWindow extends Expect {

    SlidingWindow() {
        super("Hello");
    }

    // Maximum sum subarray of size K
    private int maxSum(int[] arr, int k){
        int sum = 0;
        for(int i=0;i<k;i++)
            sum += arr[i];

        int max = sum;

        for(int i=k;i<arr.length;i++){
            sum += arr[i] - arr[i-k];
            max = Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        SlidingWindow slidingWindow = new SlidingWindow();
        System.out.println("Maximum sum subarray of size K: " + slidingWindow.maxSum(new int[]{9, 3, 1, 4, 5, 6, 2, 8}, 2));
    }
}
