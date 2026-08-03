package Recursion;

//import static com.sun.tools.javac.jvm.ByteCodes.ret;
// static com.sun.tools.javac.jvm.ByteCodes.swap;
//import static java.util.Collections.swap;

class Solution4{
    int i = 0 ;
    public void reverse(int arr[] , int n){
        if(i >= n/2){
            return;
        }
        swap(arr , i , (n-i-1));
        i++;
        reverse(arr , n);
    }

    private void swap(int[] arr, int i , int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
public class ReverseArray {
    public static void main() {
        int[] arr = new int[]{4, 6, 3, 8, 1};
        Solution4 sol = new Solution4();
        sol.reverse(arr , 5);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
