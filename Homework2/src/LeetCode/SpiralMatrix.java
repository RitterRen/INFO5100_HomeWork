package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class SpiralMatrix {
    public static int[] solution(int[][] matrix) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int d = 0;
        int[][] visited = new int[matrix.length][matrix[0].length];
        int i = 0, j = 0;
        int[] res = new int[ matrix.length * matrix[0].length ];
        for ( int k = 0; k < matrix.length * matrix[0].length; k++ ) {
            res[k] = matrix[i][j];
            visited[i][j] = 1;
            if ( i + directions[d][0] >= matrix.length || i + directions[d][0] < 0 ||
                    j + directions[d][1] >= matrix[0].length || j + directions[d][1] < 0 ||
                        visited[i + directions[d][0]][j + directions[d][1]] != 0) {
                d = ( d + 1 ) % 4;
            }
            i = i + directions[d][0];
            j = j + directions[d][1];

        }
        return res;
    }
}
