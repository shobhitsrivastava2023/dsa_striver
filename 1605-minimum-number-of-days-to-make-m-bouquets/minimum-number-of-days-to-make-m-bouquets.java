class Solution {
    

    public static boolean possible(int[] arr, int day , int m, int k){
        int n = arr.length; 
        int cnt= 0;
        int nofb = 0;
        for(int i = 0; i< n;i++){
            if(arr[i]<=day){
                cnt++;

            }else { 
               nofb += (cnt/k);
               cnt = 0;

            }
           
           
        }
         nofb += (cnt/k);
         return nofb >=m ;
    }

   

   
        
    public int minDays(int[] arr, int m, int k) {
      long val = (long) m*k; 
         int n = arr.length;
         if (val > n)
         return -1;
        int mini = Integer.MAX_VALUE;
         int maxi = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
         int low = mini;
         int high = maxi; 
         while(low<= high){
            // overflow condition high - low
             int mid = low + (high - low)/2;
             if(possible(arr, mid,m,k)){
                high = mid - 1;

             }
             else{
                low = mid+1;
             }

         }
         return low;      

    }

    
}