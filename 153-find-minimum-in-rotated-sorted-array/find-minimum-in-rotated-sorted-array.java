class Solution {
    public int findMin(int[] arr) {
       int right = arr.length - 1;
        int left = 0;
        int index_boundary = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= arr[arr.length - 1]) {
                index_boundary = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return arr[index_boundary];
    }
}
