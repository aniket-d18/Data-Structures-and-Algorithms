package Arrays;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

class Solution136 {
    public int singleNumber(int[] nums) {
        int result = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            result = result ^ nums[i];
        }
        return result ;
    }
}
public class LC136 {
    static void main(String[] args) {
        int[] nums = {1 , 2 , 1 , 2 , 4} ;
        Solution136 sol = new Solution136();
        System.out.println(sol.singleNumber(nums));

//        int a = 5, b = 3;
//        System.out.println(a ^ a);
//        System.out.println(a ^ 0);
//        System.out.println(a ^ b ^ b);
//        System.out.println(a ^ b);
//        System.out.println(1^2^1^2^4);
//        System.out.println();
    }
}
