class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row = 0;
        int col = matrix[0].length -1;

        while (row < matrix.length && col >= 0) {
            int currentvalue = matrix[row][col];

            if (currentvalue == target) {
                return true;
            } else if (currentvalue > target) {
                 col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}