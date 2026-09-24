package Recursion;
class SolutionSumOfArrayElements {
    int helper(int ind , int sum , int[] nums){
        if(ind == nums.length){
            return sum;
        }
        sum = sum + nums[ind];
        return helper(ind + 1 , sum , nums);

    }
    public int arraySum(int[] nums) {
        return helper(0 , 0 , nums);
    }
}
public class SumOfArrayElements {
    static void main() {
        SolutionSumOfArrayElements sol = new SolutionSumOfArrayElements();
        int[] arr = {1 , 2 , 3 , 6 , 7 ,8 };
        System.out.println(sol.arraySum(arr));
    }
}
