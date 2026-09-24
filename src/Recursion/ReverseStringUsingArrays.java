package Recursion;

import java.util.Arrays;
import java.util.Collections;

class Solution344 {
    void helper(int start , int end , char[] arr){
        if(start >= end){
            return;
        }
        swap(arr , start , end);
        helper(start + 1 , end -1  , arr);
    }

    private void swap(char[] arr, int i , int j) {
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public void reverseString(char[] s) {
        helper(0 , s.length - 1 , s );
    }
}

/* Optimal Approach
public void reverseString(char[] s) {
        List<Character> n = new ArrayList<>();
        for(int i = s.length-1 ; i>=0; i-- ){
            n.add(s[i]);
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = n.get(i);
        }

    }
 */
public class ReverseStringUsingArrays {
    static void main() {
        Solution344 sol = new Solution344();
        char[] arr = {'h' , 'e' , 'l' , 'l' , 'l' , 'o'};
        sol.reverseString(arr);
    }
}
