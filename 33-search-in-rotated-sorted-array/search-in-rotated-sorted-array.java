class Solution {
    public int search(int[] nums, int target) {
        int pivot = findpiovt(nums);

        //if we didn't find a pivot, it means the array is not rotated
        if (pivot == -1) {
            return bs(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[pivot] && target <= nums[nums.length -1] ) {
            return bs(nums, target, pivot + 1, nums.length -1);
        }
        return bs(nums, target, 0, pivot - 1);
    }
         int bs(int[] arr, int target, int start, int end){
         while (start <= end) {
             int mid = start + (end - start) / 2;
             if (target < arr[mid]) {
                 end = mid - 1;
             } else if (target > arr[mid]) {
                 start = mid + 1;
             } else {
                 return mid;
             }
         }
         // return start;
         return -1;
     }


           int findpiovt(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start; 
    }
}