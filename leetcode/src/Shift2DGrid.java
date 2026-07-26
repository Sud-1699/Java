import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shift2DGrid {
    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int k = 1;

        int[][] result = new int[grid.length][grid.length];
        while(k > 0) {
            int temp = 0;

            for(int i = 0; i < grid.length; i++) {
                for(int j = 0; j < grid[i].length; j++) {
                    if(j+1 < grid[i].length) {
                        result[i][j+1] = grid[i][j];
                    } else if (i+1 < grid.length && j == grid[i].length - 1) {
                        result[i + 1][0] = grid[i][j];
                    } else if(i == grid.length - 1 && j == grid[i].length - 1) {
                        result[0][0] = grid[i][j];
                    }
                }
            }

            k--;
        }

        List.of(result);

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
