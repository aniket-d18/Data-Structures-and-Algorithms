package Learn_the_Basics.Logic_Building.Pattern_Problems;

class Solution3 {
    // Function to print Pattern 7
    public void pattern3(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {

            // Print leading spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // Print trailing spaces
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Move to next row
            System.out.println();
        }
    }
}

public class Pattern3 {
    public static void main(String[] args) {
        Solution3 sol = new Solution3();
        int N = 5;
        sol.pattern3(N);
    }
}

