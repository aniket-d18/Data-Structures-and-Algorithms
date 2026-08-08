//package Recursion.SubSequences;

import java.awt.*;
import java.util.ArrayList;

class SubSequences2 {
    int s = 0;
    public void print(int idx , int[] arr, ArrayList arl ,int n , int sum){
        if(idx == n){
            if(s == sum){
                for(Object x:arl){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            return ;
        }
        arl.add(arr[idx]);
        s = s + arr[idx] ;
        print(idx + 1 , arr , arl , n , sum);

        arl.remove(arl.size() - 1);
        s -= arr[idx] ;
        print(idx + 1 , arr , arl , n , sum);
    }
}


void main() {
    ArrayList<Integer> arl = new ArrayList<>();
    int[] arr = {1 , 2 , 1 };
    int n = arr.length;
    int sum = 2 ;
    new SubSequences2().print(0,arr , arl, n , sum);

}
