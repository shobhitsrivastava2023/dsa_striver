class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid is not at an even index, adjust it
            if (mid % 2 == 1)
                mid--;

            // Check if the single element is to the right of mid
            if (nums[mid] != nums[mid + 1])
                high = mid;
            // If not, it must be to the right
            else
                low = mid + 2;
        }

        return nums[low];
    }
}
