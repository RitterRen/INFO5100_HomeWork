package LeetCode;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "makes";
        System.out.println(ShortestWordDistance.solution(wordsDict, word1, word2));

        int[] nums = {0};
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println(Arrays.toString(MoveZeroes.solution(nums)));
        System.out.println(Arrays.deepToString(RotateImage.solution(matrix)));

        System.out.println(Arrays.toString(SpiralMatrix.solution(matrix)));
        System.out.println(Tester.transpose(matrix));
    }

    public static int[][] transpose(int[][] A) {

        int rows = A.length;
        int columns = A[0].length;

        int[][] new_matrix = new int[columns][rows];

        for (int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                new_matrix[j][i] = A[i][j];
            }
        }
        return new_matrix;
    }
}

