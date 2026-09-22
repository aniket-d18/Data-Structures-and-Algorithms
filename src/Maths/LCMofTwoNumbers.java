package Maths;
class SolutionLCM {
    public int LCM(int n1, int n2) {
        Solution4 sol = new Solution4();
        int gcd = sol.GCD(n1 , n2 );
        int lcm = (n1 * n2)/gcd;
        return lcm ;
    }
}
public class LCMofTwoNumbers {
    static void main() {
    SolutionLCM sol = new SolutionLCM();
        System.out.println(sol.LCM(4 , 6));
    }
}
