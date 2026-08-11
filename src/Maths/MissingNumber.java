package Maths;
class LC256{
    public int missingNumber(int[] nums) {
        int sum1= 0 , sum2 = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum1+=nums[i];
        }
        int n = nums.length;
        sum2 = (n*(n+1)/2);
        return sum2 - sum1;
    }
}

public class MissingNumber {
    static void main() {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        LC256 sol = new LC256();
        System.out.println(sol.missingNumber(arr));
    }
}
