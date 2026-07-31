package Learn_the_Basics.Basic_Maths;
class Solution8{
    public double muPow(double x , int n){
        double ans = 1 ;
        for (int i = 1; i <= n ; i++) {
            ans = ans * x ;
        }
        if(n < 0){
            return 1/ans ;
        }else {
            return ans;
        }
    }
}
public class PowerOfNumber {
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        System.out.println(sol.muPow(2 , -2));
    }
}
