package Learn_the_Basics.Basic_Maths;

import static java.lang.Math.min;
import static java.lang.Math.toDegrees;

class Solution4{
    public int GCD(int n1 , int n2){
        int gretestCommon = 1 ;
        for (int i = 1; i < min(n1 , n2); i++) {
            if(n1 % i == 0 & n2 % i == 0){
                gretestCommon = i;
            }
        }
        return  gretestCommon;
    }
}
public class GCD {
    public static void main(String[] args) {
        Solution4 sol = new Solution4();
        System.out.println(sol.GCD(12 , 18));
    }
}
