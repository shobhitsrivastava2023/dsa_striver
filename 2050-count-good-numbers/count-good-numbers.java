class Solution {
    static final int MOD = 1000000007; 
    public static long modularExponentiation(long base, long exponent) {
        long result = 1;
        long power = base % MOD;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * power) % MOD;
            }
            power = (power * power) % MOD;
            exponent >>= 1;
        }
        
        return result;
    }

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;
        long totalGoodStrings = (modularExponentiation(5, evenPositions) * modularExponentiation(4, oddPositions)) % MOD;
        
        return (int) totalGoodStrings;
    }
}
