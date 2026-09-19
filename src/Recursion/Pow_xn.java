package Recursion;
class Solution50 {
    public double myPow(double x, int n) {
        //handling negative power
        if(n < 0){
            n = -1 * n ;
            return 1/myPow(x , n);
        }
        // Base case: anything raised to 0 is 1
        if(n == 0) return 1.0 ;

        //Base case anything raised to 1 is itself
        if(n == 1) return x ;

        //if n is even
        // Recursive call: square the base and halve the exponent
        if(n % 2 == 0){
            return myPow(x * x , n/2);
        }

        //If 'n' is odd
        //Recursive call: multiply base once and reduce exponent by 1
        return x * myPow(x , n-1);
    }
}
public class Pow_xn {
    static void main() {
        Solution50 sol = new Solution50();
        System.out.println(sol.myPow(2 , -2));
    }
}
