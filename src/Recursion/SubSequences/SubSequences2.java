//package Recursion.SubSequences;
//Onlu one answer we want
import java.awt.*;
import java.util.ArrayList;

class SubSequences2 {
    int s = 0;
    public int print(int idx , int[] arr, ArrayList arl ,int n , int sum){
        if(idx == n){
            //Condition satisfied
            if(s == sum){
                for(Object x:arl){
                    System.out.print(x + " ");
                }
                return 1 ;
            }
            else return 0 ;

        }
        arl.add(arr[idx]);
        s = s + arr[idx] ;
        int l = print(idx + 1 , arr , arl , n , sum);

        //no pick
        arl.remove(arl.size() - 1);
        s -= arr[idx] ;
        int r = print(idx + 1 , arr , arl , n , sum) ;

        return r + l ;
    }
}


void main() {
    ArrayList<Integer> arl = new ArrayList<>();
    int[] arr = {1 , 2 , 1 };
    int n = arr.length;
    int sum = 2 ;
    System.out.println(new SubSequences2().print(0,arr , arl, n , sum));
    System.out.println();

}
