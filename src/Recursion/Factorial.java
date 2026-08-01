package Recursion;
class Solution{
    public int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
public class Factorial {
    public static void main() {
        Solution solution = new Solution();
        System.out.println(solution.factorial(100));
    }
}
