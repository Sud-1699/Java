public class SearchTwoDMatrixll {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;

//        System.out.println(isFound(matrix, target));
        System.out.println(isFoundV2(matrix, target));
    }

    public static boolean isFound(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int l = 0;
            int r = ints.length - 1;

            while (l <= r) {
                int m = (l + r) / 2;
                if (ints[m] == target) {
                    return true;
                } else if (target < ints[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }
        }

        return false;
    }

    public static boolean isFoundV2(int[][] matrix, int target) {
        int l = 0, r = matrix.length - 1;
        while(l <= r) {
            int m = (r + l) / 2;

            int[] subMatrix = matrix[m];
            int l1 = 0, r1 = subMatrix.length - 1;
            while(l1 <= r1) {
                int m1 = (r1 + l1) / 2;

                if(subMatrix[m1] == target) {
                    return true;
                } else if(target < subMatrix[m1]) {
//                    r = m - 1;
                    r1 = m1 - 1;
                } else {
//                    l = m + 1;
                    l1 = m1 + 1;
                }
            }

            if(r1 < m) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return false;
    }
}
