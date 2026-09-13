package Arrays;
class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int[] Op = new int[nums.length];
        for (int i = 0 ; i < nums.length ; i++) {
            int product = 1 ;
            for (int j = 0 ; j < nums.length ; j++) {
                if(j == i){
                    continue;
                }
                product = product * nums[j] ;
            }
            Op[i] = product ;
        }
        for (int x :Op){
            System.out.print(x + " ");
        }
        return Op ;
    }
}
public class ProductOfArrayExpectItself {
    static void main() {
        Solution238 sol = new Solution238();
        int arr[] = {1 , 2 ,3 , 4};
        sol.productExceptSelf(arr);
    }
}
