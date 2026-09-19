package Recursion.SubSequences;

import java.util.ArrayList;
import java.util.List;

class SolutionSubsequenceBitManipulation{
    public List<String> getSubsequences(String s) {
        int n = s.length();

        int total =  1 << n ;   //i.e 2^n

        List<String> ds = new ArrayList<>();
        // Iterate over all bit masks from 0 to 2^n - 1
        for(int mask = 0 ; mask < total - 1 ; mask ++){
            // Temporary subsequence builder
            StringBuilder subseq = new StringBuilder();

            // Check each bit position in mask
            for (int i = 0; i < n; i++) {
                // If i-th bit of mask is set, include s.charAt(i)
                if((mask & (1 << i)) != 0){
                    subseq.append(s.charAt(i));
                }
            }
            // Store the formed subsequence as string
            ds.add(subseq.toString());
        }
        return ds ;
    }
}
public class GenerateSubsequencesUsingBitManipulation {
    static void main() {

        String s = "abc";

        SolutionSubsequenceBitManipulation sol = new SolutionSubsequenceBitManipulation();
        // Get all subsequences
        List<String> subsequences = sol.getSubsequences(s);

        // Print all subsequences
        for (String subseq : subsequences) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}
