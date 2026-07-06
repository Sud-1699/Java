
public class AllPairsShortestPath {
    public static void main(String[] args) {
        int n = 4;
        int INF = (int)1e8;
        int[][] matrix = {{0, 4, INF, 5, INF},
                {INF, 0, 1, INF, 6},
                {2, INF, 0, 3, INF },
                {INF, INF, 1, 0, 2},
                {1, INF, INF, 4, 0}};;

        floydWarshall(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void floydWarshall(int[][] matrix) {
        int n = matrix.length;
        int INF = (int)1e8;

        for(int k = 0; k < n; k++) {
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(matrix[i][k] != INF && matrix[k][j]!= INF)
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                }
            }
        }
    }
}
