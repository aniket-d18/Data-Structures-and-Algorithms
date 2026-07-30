package Learn_the_Basics.Basic_Maths;

class Solution7{
    public int mySqrt(int x){
        int low = 1  , high = x ;
        int ans = 1 ;
        while(low <= high){
            int mid = (low + high)/ 2 ;
            if(mid * mid <= x){
                ans = mid ;
                low = mid + 1 ;
            }
            else{
                high = mid -1 ;
            }
        }
        return high  ;
    }
}
public class Squrt {
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        System.out.println(sol.mySqrt(8));
    }
}
