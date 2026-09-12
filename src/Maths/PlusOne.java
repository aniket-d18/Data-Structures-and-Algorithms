package Maths;
class Solution66 {
    public int[] plusOne(int[] digits)
    {
        int n = digits.length;
        for(int i = n-1 ; i >= 0 ; i--) {
            if(digits[i] < 9){
                digits[i] = digits[i] + 1 ;
                for(int x : digits){
                    System.out.print(x + " ");
                }
                return  digits ;
            }
            else {
                digits[i] = 0 ;
            }
        }
        int[] newDigits = new int[n+1] ;
        newDigits[0] = 1 ;
        for (int i = 1; i < n ; i++) {
            newDigits[i] = 0 ;
        }
        for(int x : newDigits){
            System.out.print(x + " ");
        }
        return  newDigits ;
    }
}
public class PlusOne {
    static void main() {
        Solution66 sol = new Solution66();
        int[] arr = {1 , 2 , 3};
        sol.plusOne(arr);
    }
}
