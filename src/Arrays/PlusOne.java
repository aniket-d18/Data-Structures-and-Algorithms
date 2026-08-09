package Arrays;

class Solution2 {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1 ; i >= 0 ; i-- ){
            if(digits[i] == 9){
                digits[i]  = 0 ;
                if(digits[i - 1] <= 9){
                    digits[i -1] += 1 ;
                    break;
                }
            }

        }
        return digits ;
    }
}

//Cant be able to solve this question
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{4, 5, 3 };
        Solution2 solution2 = new Solution2();
        solution2.plusOne(digits);
        for(int x : digits){
            System.out.print(x);
        }
    }
}
