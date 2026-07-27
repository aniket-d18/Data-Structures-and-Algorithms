package Learn_the_Basics.Basic_Maths;
class Solution6{
    public boolean isPrime(int n){
       int count = 0 ;
        for (int i = 1; i <= n ; i++) {
            if( n % i == 0){
                count++ ;
            }
        }
        if(count == 2){
            return true ;
        }
        else{
            return false ;
        }
    }
}
public class CheckPrime {
    public static void main(String[] args) {
        int n = 98 ;
        Solution6 sol = new Solution6();
        System.out.println(sol.isPrime(n));
    }
}
