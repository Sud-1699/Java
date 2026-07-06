import java.util.Arrays;

// 4.1.1 MultiStage Graph (Program) - Dynamic Programming
public class MultiStageGraph {

    // Time complexity is O(n^2)
    public static void main(String[] args) {
        int stages = 4, min;
        int n = 8; // Vertices

        int[] cost = new int[9];
        int[] d = new int[9];
        int[] path = new int[9];

        int[][] c = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 2, 1, 3, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 2, 3, 0, 0},
                {0, 0, 0, 0, 0, 6, 7, 0, 0},
                {0, 0, 0, 0, 0, 6, 8, 9, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 6},
                {0, 0, 0, 0, 0, 0, 0, 0, 4},
                {0, 0, 0, 0, 0, 0, 0, 0, 5},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };

        cost[n] = 0;
        for (int i = n - 1; i >= 1; i--) { // Traverse vertices from backwardly
            min = Integer.MAX_VALUE;
            for (int k = i + 1; k <=n; k++) { // Cost calculation for finding minimum cost
                // Formula cost[i] = min{ c[i][k] + c[k] }
                if(c[i][k] != 0 && (c[i][k] + cost[k]) < min) {
                    min = c[i][k] + cost[k];
                    d[i] = k;
                }
            }

            cost[i] = min;
        }

        path[1] = 1; path[stages] = n;
        for (int i = 2; i < stages; i++) {
            path[i] = d[path[i - 1]];
        }

        System.out.println(Arrays.toString(path));
    }
}
