package Maths;
class Solution8{
    public double muPow(double x , int n){
        double ans = 1 ;
        if(n == 0){
            return 1 ;
        }
        if(n < 0){
            int pow = -n ;
            for (int i = 1; i <= pow; i++) {
                float tempans = 1 ;
                tempans = (float)(1/(tempans * x));
                ans = tempans * ans ;
            }
            return ans ;
        }
        for (int i = 1; i <=n ; i++) {
            ans = ans * x ;
        }
        return ans ;
    }
}
public class PowerOfNumber {
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        System.out.println(sol.muPow(2 , -2));
    }
}
