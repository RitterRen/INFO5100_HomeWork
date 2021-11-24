package LeetCode;

public class RotateImage {
    public static int[][] solution(int[][] matrix) {
        if ( matrix.length == 0 ) {
            return matrix;
        }
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        int row, col = 0;
        for ( int i = 0; i < matrix[0].length; i++ ) {
            row = 0;
            for ( int j = matrix.length - 1; j > -1; j-- ) {
                System.out.println("j = " + j + " i = " + i + " row = " + row + " col = " + col);
                newMatrix[col][row] = matrix[j][i];
                row++;
            }
            col++;
        }
        return newMatrix;
    }
}
