package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solutio977 {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i] ;
        }
        Arrays.sort(nums);
        return nums ;
    }
}
public class SquareOfArrayElemnts {
    static void main() {
        int[] arr = {-4 , -2 , 0 , 3 , 4};
        Solutio977 sol = new Solutio977();
        sol.sortedSquares(arr);
    }
}
