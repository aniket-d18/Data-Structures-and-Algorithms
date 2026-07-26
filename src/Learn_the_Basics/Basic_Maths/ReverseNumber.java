package Learn_the_Basics.Basic_Maths;
class Solution2{
    public int reverseNumber(int n){
//        if(n > 0) {
//            int reverseNumber = 0;
//            while (n > 0) {
//                int lastDigit = n % 10;
//                reverseNumber = (reverseNumber * 10) + lastDigit;
//                n = n / 10;
//            }
//            return reverseNumber;
//        }
//        else {
//            n = -n;
//            int reverseNumber = 0;
//            while (n > 0) {
//                int lastDigit = n % 10;
//                reverseNumber = (reverseNumber * 10) + lastDigit;
//                n = n / 10;
//            }
//            return -reverseNumber;
//        }
        int reverseNum = 0 ;
        while(n !=0 ){
            int lastDigit = n % 10;
            reverseNum = reverseNum * 10 + lastDigit ;
            n = n/ 10;
        }
        return reverseNum ;
    }
}
public class ReverseNumber {
    public static void main(String[] args) {
        int n = 7764;
        Solution2 sol = new Solution2();
        System.out.println(sol.reverseNumber(n));
    }
}
