class Solution {
    public void reverse(int[] nums, int start, int end){
         while(start<=end){
         // array reversal algo
         int temp = nums[start];
         nums[start] = nums[end];
         nums[end] = temp;
         start++;
         end--;
     }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
      k %= n; // in case k is greater than nums.length
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    
}