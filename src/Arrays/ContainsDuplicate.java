package Arrays;

import java.util.*;


class Solution217 {
    public boolean containsDuplicate(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if(i == j){
//                    continue;
//                }
//                if(nums[i] == nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false ;
        //this approach uses O(n2) T.C. which is not efficient
        //lets try new approach
        Set<Integer> seen = new HashSet<>();
        for(int x: nums){
            if(seen.contains(x)){
                return true ;
            }
            seen.add(x);
        }
        return false ;
    }
}
public class ContainsDuplicate {
    static void main() {
        int[] arr = {1,2,3,6};
        Solution217 sol = new Solution217();
        System.out.println(sol.containsDuplicate(arr));
    }
}
