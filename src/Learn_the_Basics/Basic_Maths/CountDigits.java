package Learn_the_Basics.Basic_Maths;

import static java.lang.Math.log10;

class Solution{
    public int countDigit(int n){
//        int count = 0;
//        while( n > 0){
//            count++;
//            n = n/10;
//        }

        int count =(int)(log10(n) + 1);
        return count;
    }
}
public class CountDigits {
    public static void main(String[] args) {
        int N = 3357;
        Solution sol = new Solution();
        System.out.println(sol.countDigit(N));
    }
}
