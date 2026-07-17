package Learn_the_Basics.Logic_Building.Pattern_Problems;

class Solution6 {
    public void pattern6(int n) {
        for(int i = 1 ; i <= n ; i++){
            // Left side numbers
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            //spaces
            for(int j = 0 ; j < 2*(n-i) ; j++){
                System.out.print(" ");
            }
            // right side numbers
            for(int j = i ; j >= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        Solution6 solution6 = new Solution6();
        solution6.pattern6(n);
    }
}
