package Maths;
class Solution3622 {
    public boolean checkDivisibility(int n) {
        int sumDigits = 0 ;
        int productDigits = 1 ;

        int dup = n ;
        while(dup > 0){
            int lastdigit = dup % 10 ;
            sumDigits += lastdigit ;
            productDigits *= lastdigit ;
            dup = dup / 10 ;
        }
        int globalSum = sumDigits + productDigits ;
        if(n % globalSum == 0){
            return  true ;
        }
        else return false ;
    }
}
public class CheckDivisibilityByDigitSumnProduct {
    static void main() {
        Solution3622 sol = new Solution3622();
        System.out.println(sol.checkDivisibility(99));
    }
}
