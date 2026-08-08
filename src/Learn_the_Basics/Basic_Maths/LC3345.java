/**
 * You are given two integers n and t.
 * Return the smallest number greater than or equal to n such that the product of its digits is divisible by t.
 *
 * Example 1:
 * Input: n = 10, t = 2
 * Output: 10
 * Explanation:
 * The digit product of 10 is 0, which is divisible by 2, making it the smallest number greater than or equal to 10 that satisfies the condition.
 *
 * Example 2:
 * Input: n = 15, t = 3
 * Output: 16
 * Explanation:
 * The digit product of 16 is 6, which is divisible by 3,
 * making it the smallest number greater than or equal to 15 that satisfies the condition.
 */



package Learn_the_Basics.Basic_Maths;
class Solution3345{
    public int smallestNumber(int n , int t){
        int i = n ;
        while(true){
            int product = 1 ;
            int temp = i ;
            while(temp > 0){
                int digit = temp % 10 ;
                product = product * digit ;
                temp = temp / 10 ;
            }
            if(product % t == 0){
                return i ;
            }
            i++;
        }
    }
}

public class LC3345 {
    static void main() {
        Solution3345 sol = new Solution3345();
        System.out.println(sol.smallestNumber(15 , 3)) ;
    }
}
