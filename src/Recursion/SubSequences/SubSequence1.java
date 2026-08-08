package Recursion.SubSequences;

import java.util.ArrayList;

class PrintSubSequence{
    public void print(int idx , ArrayList arl , int arr[] , int n ){
        if(idx == n){
            for(Object x : arl){
                System.out.print(x + " ");
            }

            if(arl.size() == 0){
                System.out.print("{}");
            }
            System.out.println();
            return ;
        }

        //Take or Pick the particular index of the subsequence
        arl.add(arr[idx]);
        print(idx+1 , arl , arr , n);
        arl.remove(arl.size() - 1);

        //Not take or not pick condition
        //This element is not added to your subsequence
        print(idx+1 , arl , arr, n);
    }
}
public class SubSequence1 {
    static void main() {
        ArrayList<Integer> arl = new ArrayList<>();
        int[] arr = {3 , 1 ,2 };
        int n = arr.length;
        PrintSubSequence ps = new PrintSubSequence();
        ps.print(0 , arl , arr , n);
    }
}
