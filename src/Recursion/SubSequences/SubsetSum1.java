package Recursion.SubSequences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class SolutionSubSetSum1 {
    void helper(int ind , int sum ,int[] arr ,  int N , ArrayList<Integer> sumSubset){
        if(ind == N){
            sumSubset.add(sum);
            return;
        }

        //Pick condition
        helper(ind+1 , sum+arr[ind] , arr , N , sumSubset);

        //Not pick condition
        helper(ind+1 , sum , arr , N , sumSubset);
    }

    public List<Integer> subsetSums(int[] nums) {
        ArrayList<Integer> sumSubset = new ArrayList<>();
//        for(int x : nums){
//            sumSubset.add(x);
//        }
        int N = nums.length;
        helper(0 , 0, nums , N , sumSubset);
        Collections.sort(sumSubset);

        return sumSubset;
    }
}
public class SubsetSum1 {
    static void main() {
        SolutionSubSetSum1 sol = new SolutionSubSetSum1();
        int[] arr = {5 , 2 ,1} ;
        System.out.println(sol.subsetSums(arr));
    }
}
