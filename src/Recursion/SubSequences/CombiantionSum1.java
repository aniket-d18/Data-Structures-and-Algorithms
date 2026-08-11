package Recursion.SubSequences;

import java.util.ArrayList;
import java.util.List;

class Solution{
    public void findCombinations(int idx , int[] arr , int target , List<List<Integer>>ans , List<Integer> ds){
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        //Pick condition
        if(arr[idx] <=target){
            ds.add(arr[idx]);
            findCombinations(idx , arr , target - arr[idx] , ans , ds);
            ds.remove(ds.size() - 1);  //after returning of recursion the added element should be removed
        }

        findCombinations(idx+1 , arr , target , ans , ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates , int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0 , candidates , target , ans , new ArrayList<>());
        return ans;
    }

}
public class CombiantionSum1 {
    static void main() {
        int[] arr = {2 , 3 , 6 , 7};
        //List<List<Integer>> ans = new ArrayList<>();
        //ArrayList<Integer> ds = new ArrayList<>();
        Solution sol = new Solution();
//        sol.findCombinations(0 , arr , 7 , ans , ds);
        //we should call to the wrapper method not to the solution method directly

        List<List<Integer>> ans = sol.combinationSum(arr, 7);
        System.out.println(ans);
    }
}
