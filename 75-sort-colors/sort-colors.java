class Solution {
    public void sortColors(int[] nums) {
      int n = nums.length; 
      int high = n - 1;
      int low = 0;
      int mid = 0;


    
      while(mid <= high){
          if(nums[mid] == 0){
              int temp = nums[low];
              nums[low] = nums[mid];
              nums[mid] = temp; 

          

         low++;
         mid++;
          }
         else if(nums[mid] == 1){
             mid++;
         }else{
             int temp = nums[mid];
             nums[mid] = nums[high]; 
             nums[high] = temp; 
             high--;
         }
      }
    }
}
