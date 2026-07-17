package Learn_the_Basics.Logic_Building.Pattern_Problems;
class Solution7 {
    public void pattern7(int n) {
        int num = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
public class Pattern7 {
    public static void main(String[] args) {
        int n = 5;
        Solution7 sol = new Solution7();
        sol.pattern7(n);
    }
}
