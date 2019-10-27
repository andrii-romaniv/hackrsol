package algorithms.firecode.level_2.transpose_matrix;

public class Solution {
    public static void transposeMatrix(int[][] matrix) {
        int n = matrix.length - 1;
        int temp = 0;
        for(int i = 0; i <= n; i++){
            for(int j = i+1; j <= n; j++){
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}