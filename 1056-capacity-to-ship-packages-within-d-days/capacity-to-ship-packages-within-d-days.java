class Solution {
    public static int noDays(int[] w, int cap){   
        int load = 0; 
        int day = 1;
        for(int i = 0; i<w.length; i++){ 
            if(load + w[i]> cap){
                day = day + 1; 
                load = w[i];
            }
            else {
                load = load + w[i]; 
            }
        }
        return day;
    }


    public int shipWithinDays(int[] weights, int days){
        int max = Integer.MIN_VALUE; 
        int n = weights.length ;
        int sum = 0;  

        for(int i = 0; i< n ; i++){ 
            max = Math.max(weights[i], max);
            sum = sum + weights[i]; 
        }

        int low  = max; 
        int high = sum;

        while(low<=high){
            int mid =  low + (high-low)/2;
            int noD = noDays(weights, mid); 
            if(noD <= days){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        } 

        return low; 
}
}