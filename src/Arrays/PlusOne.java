package Arrays;
class Solution2 {
    public int[] plusOne(int[] digits) {
        int lastIndex = digits.length - 1 ;
        //digits[lastIndex] += 1;
        if(digits[lastIndex] == 9){
            digits[lastIndex - 1] += 1;
            digits[lastIndex] = 0 ;
        }
        else{
            digits[lastIndex] += 1;
        }

        return digits;

    }
}
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{4 , 5 , 6 };
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.plusOne(digits));
    }
}
