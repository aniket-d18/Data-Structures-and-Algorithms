package Recursion.SubSequences;

import java.util.ArrayList;
import java.util.List;

class Solution22 {
    void helper(int n , int open , int close , String curr , ArrayList<String> ds){
        if(curr.length() == 2*n){
            ds.add(curr);
            return;
        }
        if(open < n){
            helper(n , open + 1 , close , curr + "(" , ds);
        }
        if(close < open){
            helper(n , open , close + 1 , curr + ")" , ds);
        }
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> ds = new ArrayList<>();
        helper(n , 0 , 0 , "" , ds);
        return ds ;
    }
}
public class GenerateParenthesis {
    static void main() {
        Solution22 sol = new Solution22();
        System.out.println(sol.generateParenthesis(3));
    }
}
