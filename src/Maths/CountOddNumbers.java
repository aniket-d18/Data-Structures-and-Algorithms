package Maths;
class Solution1523 {
    public int countOdds(int low, int high) {
        if(low % 2 != 0 || high % 2 != 0)
        {
            int temp = high - low ;
            return (temp / 2 ) + 1;
        }
        int temp = high - low ;
        return temp / 2 ;
    }
}
public class CountOddNumbers {
    static void main() {
        Solution1523 sol = new Solution1523();
        System.out.println(sol.countOdds(2 , 8));
    }
}
