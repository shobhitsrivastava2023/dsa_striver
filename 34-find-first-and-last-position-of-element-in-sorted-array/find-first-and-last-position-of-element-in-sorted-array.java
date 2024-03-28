class Solution {
    public int firstOccurance(int[] arr, int target, int n){
         int low = 0; 
         int high = n -1; 
         int ans = -1;
         while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                ans = mid; 
                high = mid - 1; 
            }
            else if(arr[mid] < target){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }

         }

         return ans;
    }

    public int lastOccurance(int[] arr, int target, int n){
         int low = 0; 
         int high = n -1; 
         int ans = -1;
         while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                ans = mid; 
                low = mid + 1;
            }
            else if(arr[mid] < target){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }

         }

         return ans;
    }
    public int[] searchRange(int[] nums, int target) {
       int n = nums.length;
       int target1 = target;
       int first = firstOccurance(nums,target1, n);
       if(first == -1){
        return new int[] {-1,-1};
       }
       int last = lastOccurance(nums,target1, n);
       return new int[]{first, last};

    }
}