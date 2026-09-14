class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                Swap(nums, i, correct);
            } else {
                i++;
            }
        }

            for (int j = 0; j<nums.length; j++){
                if (nums[j] != j) {
                    return j;
                }
            }
            return nums.length;
        }
        void Swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}