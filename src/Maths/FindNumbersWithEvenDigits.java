package Maths;
class Solution1295 {
    public int findNumbers(int[] nums) {
        int globalcount = 0;
        for(int i = 0 ; i < nums.length ; i++ ){
            int count = 0 ;
            while(nums[i] > 0 ){
                nums[i] = nums[i] / 10 ;
                count ++ ;
            }
            if(count % 2 == 0){
                globalcount ++ ;
            }
        }
        return globalcount ;
    }
}
public class FindNumbersWithEvenDigits {

    static void main() {
        int[] arr = {12,345,2,6,7896};
        Solution1295 sol = new Solution1295();
        System.out.println(sol.findNumbers(arr));
    }
}
