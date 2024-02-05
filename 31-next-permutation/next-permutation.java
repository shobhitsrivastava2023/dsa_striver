import java.util.*;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

       
        int ind = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

       
        for (int j = n - 1; j > ind; j--) {
            if (nums[j] > nums[ind]) {
           
                int temp = nums[ind];
                nums[ind] = nums[j];
                nums[j] = temp;
                break;
            }
        }

       
        reverse(nums, ind + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
           
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
           
            start++;
            end--;
        }
    }
}