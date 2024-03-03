class Solution {
    public int missingNumber(int[] nums) {
        // brute force 
        int n = nums.length;
        int sum = 0;
        int diff = 0;
        for(int i = 0; i<n;i++){
            sum = sum + nums[i];
            diff = diff + (i+1);
        }

        return diff - sum;
        
    }
}