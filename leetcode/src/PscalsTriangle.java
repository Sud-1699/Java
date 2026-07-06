import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PscalsTriangle {

    public static void main(String[] args) {
        List<List<Integer>> results = Arrays.asList(Arrays.asList(1));
        List<List<Integer>> results1 = new ArrayList<>();

        results1.add(0, new ArrayList<>());
        results1.get(0).add(0);
        results1.get(0).add(1);

        System.out.println(results1);

        /*int n = 1;

        while(n < 5) {
            int k = 0;
            while(k < n) {
                results.get(n).add((results.get(n - 1).get(k)) + results.get(n - 1).get(k));
                k++;
            }

            n++;
        }

        System.out.println(results);*/
    }
}
