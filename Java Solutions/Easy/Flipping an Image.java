class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int numRows = image.length;
        int numCols = image[0].length - 1;
        
        for (int i = 0; i < numRows; i++) {
            int start = 0;
            int end = numCols;
            
            while(start<=end) {
                int temp = image[i][start];
                image[i][start++] = image[i][end] == 1 ? 0 : 1;
                image[i][end--] = temp == 1 ? 0 : 1;
            }
        }
        return image;
    }
}
