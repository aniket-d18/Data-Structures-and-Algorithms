package Learn_the_Basics.Logic_Building.Pattern_Problems;

class Solution10 {
    public void pattern10(int n) {
        // Upper half
        for(int i = 0 ; i < n ; i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        Solution10 sol = new Solution10();
        sol.pattern10(n);
    }
}
