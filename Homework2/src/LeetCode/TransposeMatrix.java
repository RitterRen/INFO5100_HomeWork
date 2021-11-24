package LeetCode;

public class TransposeMatrix {
    public int[][] solution(int[][] matrix) {
        if ( matrix.length <= 1 ) {
            return matrix;
        }
        int[][] newMatrix = new int[matrix.length][matrix[0].length];
        int row, col = 0;
        for ( int i = 0; i < matrix[0].length; i++ ) {
            row = 0;
            for ( int j = 0; j < matrix.length; j++ ) {
                newMatrix[col][row] = matrix[j][i];
            }
            col++;
        }
        return newMatrix;
    }
}


