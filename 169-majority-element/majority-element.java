class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value+1);
        }

        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();

            }
        }

        return -1;


    }
}