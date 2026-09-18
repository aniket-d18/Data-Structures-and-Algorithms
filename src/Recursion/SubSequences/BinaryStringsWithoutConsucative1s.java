package Recursion.SubSequences;

import java.util.*;

class SolutionBinaryStrings {
    void helper(int n , String curr , List<String> ds ){
        if(curr.length() == n){
            ds.add(curr);
            return ;
        }
        //always try adding 0
        helper(n , curr + "0" , ds );

        //add 1 only if previous char was not 1
        if(curr.isEmpty() || curr.charAt(curr.length() -1) != '1'){
            helper(n , curr + "1" , ds);
        }
    }

    public List<String> generateBinaryStrings(int n) {
        List<String> ds = new ArrayList<>();
        helper(n , "" , ds);
        return ds ;
    }
}
public class BinaryStringsWithoutConsucative1s {
    static void main() {
        SolutionBinaryStrings sol = new SolutionBinaryStrings();
        System.out.println(sol.generateBinaryStrings(3));
    }
}
