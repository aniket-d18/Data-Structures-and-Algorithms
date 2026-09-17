package Recursion.SubSequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution40{
    private void findCombinations2(int ind , int[] arr ,int target , List<List<Integer>> ans , List<Integer> ds ){
        //base condition
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind ; i < arr.length ; i++){
            if(i > ind && arr[i] == arr[i-1]) continue;

            if(arr[i] > target) break;

            //Pick condition
            ds.add(arr[i]);
            findCombinations2(i+1 ,arr ,target- arr[i] , ans , ds );
            ds.remove(ds.size() - 1) ;
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations2(0 , candidates , target ,  ans , new ArrayList<>() );
        return ans ;
    }
}
public class CombinationSum2 {
    static void main() {
        int[] arr = {10,1,2,7,6,1,5};
        int target = 8 ;
        Solution40 sol = new Solution40();
        List<List<Integer>> ans = sol.combinationSum2(arr , target);
        System.out.println(ans);
    }
}
