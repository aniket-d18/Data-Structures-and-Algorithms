package Recursion;
class Solution1922 {

    static final int MOD = 1_000_000_007;

    int helper(int ind , long n ){
        if(ind == n){
            return 1;
        }

        int result = 0 ;
        //even digits
        if(ind % 2 == 0 ){
            int[] evenDigits = { 2 , 4 , 6, 8};
            for(int x : evenDigits){
                result = (result + helper(ind+1 , n)) % MOD;
            }
        }

        //odd index
        else{
            int[] primeDigits = {2 , 3 , 5 , 7};
            for (int x : primeDigits){
                result = (result + helper(ind+ 1 , n)) % MOD;
            }
        }
        return result ;
    }
    public int countGoodNumbers(long n) {
        return helper(0 , n);
    }
}
public class CoungGoodNumbers {
    static void main() {

    }
}
