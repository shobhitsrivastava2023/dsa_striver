class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
        int preSum =0;

        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
          for (int i = 0; i < nums.length; i++) {
              
            preSum += nums[i];

       
            int remove = preSum - k;

           
            cnt += mpp.getOrDefault(remove, 0);

            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);

            
          
            
        }
        return cnt;
    }
}