class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        // switch from a to b we need to wait for an hour 
        long maxA  = 0;
        long maxB  = 0; 
        int n = energyDrinkA.length; 
        for(int i = 0;i<n; i++){ 
            long newMaxA = Math.max(maxA+ energyDrinkA[i], maxB); 
            long newMaxB  = Math.max(maxB + energyDrinkB[i], maxA); 
            maxA = newMaxA; 
            maxB = newMaxB; 


        } 
        return Math.max(maxA, maxB); 

        
        
        
    }
}