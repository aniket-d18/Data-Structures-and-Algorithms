package Arrays;
class Solution1480 {
    public int[] runningSum(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0 ;
            for(int j = 0 ; j <= i ; j++){
                sum = sum + nums[j] ;
            }
            nums[i] = sum ;
        }
        return nums ;
    }
}
public class RunningSumOf1DArray {
    static void main() {
        int[] arr = {1,2,3,4};
        Solution1480 sol = new Solution1480();
        int[] nums = sol.runningSum(arr);
        for(int x : nums){
            System.out.print(x + " ");
        }
    }
}
