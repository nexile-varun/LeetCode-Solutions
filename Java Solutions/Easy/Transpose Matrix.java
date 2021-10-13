class Solution {
    public int[][] transpose(int[][] matrix) {
        
        if (matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        
        int[][] ans = new int[matrix[0].length][matrix.length];
        
        for (int row = 0; row < matrix[0].length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                
                ans[row][col] = matrix[col][row];
            }
        }
        
        return ans;
        
    }
}
