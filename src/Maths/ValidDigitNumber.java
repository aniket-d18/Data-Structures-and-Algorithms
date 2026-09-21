package Maths;
class Solution3908 {
    public boolean validDigit(int n, int x) {
        int lastdigit = 0;
        int flag = 0;
        while(n > 0){
            lastdigit = n % 10 ;
            if(lastdigit == x){
                flag = 1 ;
            }
            n = n / 10 ;
        }
        if(lastdigit != x && flag == 1){
            return true ;
        }
        else{
            return false ;
        }
    }
}
public class ValidDigitNumber {
    static void main() {
        Solution3908 sol = new Solution3908();
        System.out.println(sol.validDigit(202 , 2));
    }
}
