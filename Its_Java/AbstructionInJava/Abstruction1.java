public class MatrixEngine {
    public static void main(String[] args) {
        // Fix 1: Declared as 2D arrays (int[][])
        int[][] matrixA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrixB = {{1, 2}, {3, 4}, {5, 6}};
		
        int r1 = matrixA.length, c1 = matrixA[0].length;
        int r2 = matrixB.length, c2 = matrixB[0].length;
		
        if (c1 != r2) {
            System.out.println("Dimension mismatch for multiplication.");
            return;
        }
        int[][] product = new int[r1][c2];
		
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    // Fix 2: Changed matrixA[j][k] to matrixA[i][k]
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Product Output Matrix Structure:");
        for (int[] row : product) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}