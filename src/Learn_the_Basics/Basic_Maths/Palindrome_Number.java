package Learn_the_Basics.Basic_Maths;
class Solution3{
    public boolean isPalindrome(int n){
        if( n < 0){
            return  false ;
        }
        int dup = n ;
        int reverseNum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit ;
            n = n/10;
        }
        if(reverseNum == dup){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Palindrome_Number {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        System.out.println(sol.isPalindrome(-123321));
    }
}
