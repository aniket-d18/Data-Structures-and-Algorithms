package Arrays;

import java.util.*;

class Solution3{
    public List<Integer> findMissingElements(int[] nums){
        ArrayList<Integer> ls = new ArrayList<>();
        for(int x : nums){
            ls.add(x);
        }
        int max = Collections.max(ls);
        int min = Collections.min(ls);
        HashSet<Integer> hs = new HashSet<>(ls);
        ArrayList<Integer> missing = new ArrayList<>();
        for (int i = min; i <= max ; i++) {
            if(!hs.contains(i)){
                System.out.println(i);
                missing.add(i);
            }
        }
        return missing;
    }
}
public class MissingElement {
    public static void main() {
        int[] nums = new int[]{3 , 5, 4, 6 , 9,};
        Solution3 sol = new Solution3();
        sol.findMissingElements(nums);
    }
}
