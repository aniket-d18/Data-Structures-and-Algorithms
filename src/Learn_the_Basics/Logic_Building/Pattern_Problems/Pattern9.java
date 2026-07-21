package Learn_the_Basics.Logic_Building.Pattern_Problems;

class Solution9 {
    public void pattern9(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }
            for (int j = i-2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }
            System.out.println();

        }
    }
}
public class Pattern9 {
    public static void main(String[] args) {
        int n = 4;
        Solution9 sol = new Solution9();
        sol.pattern9(n);
    }
}
