class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int rows = 0; rows<accounts.length; rows++) {
            int rowsum = 0;
            for (int col=0; col<accounts[rows].length; col++) {
                rowsum += accounts[rows][col];
            }
            if (rowsum > max){
                max = rowsum;
            }
        }
        return max;
    }
}