package Maths;

class Solution29{
    public int divide(int dividend, int divisor) {
        int division = dividend / divisor;
        return division ;
    }
}
public class DivideTwoInteger {
    static void main() {
        Solution29 sol = new Solution29();
        System.out.println(sol.divide(10 , -3));
    }
}
