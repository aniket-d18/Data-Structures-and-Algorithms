package Recursion;
import java.util.*;
class Solution5{
    int i = 0 ;
    public boolean palindromeCheck(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "")
                          .toLowerCase();
        int n = cleaned.length();
        if(i >= n/2){
            return true;
        }
        if(cleaned.charAt(i) != cleaned.charAt(n-i-1)){
            return false ;
        }
        else{
            i++;
            return palindromeCheck(cleaned);
        }
    }
}

public class PalindromeString {
    public static void main() {
        Solution5 sol = new Solution5();
        System.out.println(sol.palindromeCheck("race a car"));
    }
}
