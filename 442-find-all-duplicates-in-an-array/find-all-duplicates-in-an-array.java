class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
           
            int num = Math.abs(nums[i]);
            
            
            if (nums[num - 1] < 0) {
                duplicates.add(num);
            } else {
               
                nums[num - 1] = -nums[num - 1];
            }
        }

        return duplicates;
    }
}