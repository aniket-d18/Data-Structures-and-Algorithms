package Learn_the_Basics.Basic_Recursion;
class Solution {
    public void printNumbers(int n) {
        helper(1, n);  // start recursion from 1
    }

    private void helper(int current, int n) {
        // Base case: stop when current exceeds n
        if (current > n) {
            return;
        }

        // Print the current number
        System.out.println(current);

        // Recursive call for the next number
        helper(current + 1, n);
    }
}

public class PrintNumbers {
    public static void main(String[] args) {
        int n = 10 ;
        Solution sol = new Solution();
        sol.printNumbers(n);
    }
}
