package Learn_the_Basics.Logic_Building.Pattern_Problems;
class Solution8 {
    public void pattern8(int n) {
        for(int i = 0 ; i <= n ; i ++){
            for(int j = 0 ; j < i ; j++){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}
public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        Solution8 sol = new Solution8();
        sol.pattern8(n);
    }
}
