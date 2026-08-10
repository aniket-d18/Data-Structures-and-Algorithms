package Maths;
class Solution202 {
    public boolean isHappy(int n) {
        long sum = 0 ;
        int temp = n ;
        while(temp > 0){
            int lastdigit = temp % 10 ;
            sum =(long) (sum + lastdigit * lastdigit) ;
            temp = temp / 10 ;
        }

        if(sum == 1){
            return true ;
        }
        if(sum < 10){
            return false ;
        }
        return isHappy((int) sum);

    }
}
public class HappyNumber {
    static void main() {
        Solution202 sol = new Solution202();
        System.out.println(sol.isHappy(1111111));
    }


}
