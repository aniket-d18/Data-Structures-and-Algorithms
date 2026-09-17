package Recursion.SubSequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution90 {

    void helper(int ind , int[] arr , List<Integer> ds , List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i = ind ; i < arr.length ; i++){
            if(i != ind && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);
            helper(i+1 , arr , ds , ansList);
            ds.remove(ds.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        helper(0 , nums , new ArrayList<>() , ansList);
        return ansList;
    }
}
public class SubsetSum2 {
    static void main() {
        Solution90 sol = new Solution90();
        int[] arr = {1 , 2 , 2};
        System.out.println(sol.subsetsWithDup(arr));
    }
}
