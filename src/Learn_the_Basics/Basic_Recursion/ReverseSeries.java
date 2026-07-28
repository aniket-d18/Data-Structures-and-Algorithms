package Learn_the_Basics.Basic_Recursion;
class Solution2 {
    public void printNumbers(int n) {
        // Base case: stop when n < 1
        if (n < 1) {
            return;
        }

        // Print the current number
        System.out.println(n);

        // Recursive call for the next smaller number
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        sol.printNumbers(5);  // Example input
    }
}


