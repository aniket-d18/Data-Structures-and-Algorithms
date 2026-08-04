package Recursion;
import java.util.*;
class Solution5{
    int i = 0 ;
    public boolean palindromeCheck(String s) {
        int n = s.length();
        if(i >= n/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(n-i-1)){
            return false ;
        }
        else{
            i++;
            return palindromeCheck(s);
        }
    }
}

public class PalindromeString {
    public static void main() {
        Solution5 sol = new Solution5();
        System.out.println(sol.palindromeCheck("madam"));
    }
}
