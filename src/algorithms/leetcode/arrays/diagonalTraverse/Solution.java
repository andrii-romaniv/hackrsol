package algorithms.leetcode.arrays.diagonalTraverse;

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return new int[0];
        int rows = matrix.length;
        int cols = matrix[0].length;
        int [] result = new int[rows*cols];
        int numbers = rows + cols -1;
        int index = 0;
        for (int i = 0; i < numbers; i++){
            if (i % 2 == 0){
                int x = i < rows ? i : rows-1;
                int y = i < rows ? 0 : i - (rows -1);
                while (x>=0 && y < cols){
                    result[index++] = matrix[x--][y++];
                }
            }else {
                int x = i < cols ? 0 : i - (cols -1);
                int y = i < cols ? i : cols-1;
                while (x < rows && y>=0){
                    result[index++] = matrix[x++][y--];
                }
            }
        }
        return result;
    }
}