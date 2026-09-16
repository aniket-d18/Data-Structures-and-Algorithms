package Recursion.SubSequences;

import java.util.ArrayList;
import java.util.List;

class SolutionBoolean {

    boolean checkSubsequence(int ind , int sum  , int target , ArrayList<Integer> ds , int[] arr , int n){
        if(ind == n){
            if(sum == target){
                return true ;
            }
            else{
                return false ;
            }
        }
        //Pick condition
        ds.add(arr[ind]);
        sum = sum + arr[ind] ;
        if(checkSubsequence(ind + 1, sum, target, ds, arr, n)){
            return true;
        }
        ds.remove(ds.size() - 1);

        //Not pick condition
        sum = sum - arr[ind];
        if(checkSubsequence(ind + 1, sum, target, ds, arr, n)){
            return true ;
        }
        else{
            return false ;
        }
    }
    public boolean checkSubsequenceSum(int[] nums, int k) {
        int sum = 0 ;
        int n = nums.length;
        return checkSubsequence(0 , sum , k , new ArrayList<Integer>() , nums , n );
    }
}
public class CheckSubSequenceWithSumK {
    static void main() {
        int[] arr = {4, 3, 9, 2};
        int k = 10 ;
        SolutionBoolean sol = new SolutionBoolean();
        System.out.println(sol.checkSubsequenceSum(arr , k));
    }
}
