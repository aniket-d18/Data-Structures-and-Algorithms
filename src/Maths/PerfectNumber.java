package Maths;
class Solution507 {
    public boolean checkPerfectNumber(int num) {
        int sum = 0 ;
        for(int i = 1 ; i < num ; i++){
            if(num % i == 0){
                sum += i ;
                if (sum > num) {
                    return false;
                }
            }
        }
        if(sum == num){
            return true ;
        }
        return false ;
    }
}
public class PerfectNumber {
    static void main() {
        Solution507 sol = new Solution507();
        System.out.println(sol.checkPerfectNumber(28));
    }
}
