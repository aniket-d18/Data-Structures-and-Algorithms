package Recursion.SubSequences;

import java.util.*;

class Solution216 {
    void helper(int start ,int length , int target , List<List<Integer>> ans , List<Integer> ds){
        if(ds.size() == length && target == 0){
            ans.add(new ArrayList<>(ds));
            return ;
        }
//        if(target <= 0 && ds.size() > length) return;

        for (int i = start; i <= 9 ; i++) {
            if(i > target) break;

            ds.add(i);
            helper(i+1 , length , target - i , ans , ds);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int start = 1;
        helper(start , k , n , ans , new ArrayList<>());
        return ans ;
    }
}
public class SubsequenceSum3 {
    static void main() {
        int n = 5 ;
        int k = 2 ;
        Solution216 sol = new Solution216();
        System.out.println(sol.combinationSum3(k , n));
    }
}
