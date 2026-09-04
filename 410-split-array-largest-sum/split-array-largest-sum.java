class Solution {
    public int splitArray(int[] nums, int k) {
        int high = 0; //end
        int low = 0; //start
        int max = 0;
        for (int i = 0; i<nums.length; i++) {
            high += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max){
                max = nums[i];
                low = max;
            }
        }
        while (low < high) {
            int mid = low + (high - low)/2;

            int piecesneeded = countpieces(nums, mid);

            if (piecesneeded <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
     int countpieces(int[] arr, int maxsum) {
        int pieces = 1;
        int currentsum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (currentsum + arr[i] > maxsum) {
                pieces = pieces + 1;
                currentsum = arr[i];
            } else {
                currentsum = arr[i] + currentsum;
            }

        }
       return pieces;
    }
} 