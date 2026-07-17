package Learn_the_Basics.Logic_Building.Pattern_Problems;

class Solution5 {
    public void pattern5(int n) {
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1" + " ");
                }
                else if((i+j)%2 == 1){
                    System.out.print("0" + " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
public class Pattern5 {
    public static void main(String[] args) {
        int N = 4;
        Solution5 sol = new Solution5();
        sol.pattern5(N);
    }
}
