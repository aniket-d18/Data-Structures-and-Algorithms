package Learn_the_Basics.Basic_Maths;
class Solution5{
    public boolean  isArmstrong(int n){
        int sum = 0 ;
        int dup = n ;
        while(n > 0){
            int lastDigit = n % 10 ;
            sum = sum + (lastDigit * lastDigit * lastDigit );
             n = n / 10;
        }
        if(sum == dup){
            return  true ;
        }
        else{
            return false ;
        }
    }
}
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153 ;
        Solution5 sol = new Solution5();
        System.out.println(sol.isArmstrong(n));
    }

}
