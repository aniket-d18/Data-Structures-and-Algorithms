package Recursion.SubSequences;


import java.util.ArrayList;

class SubsequenceWithSum{
    void print(int ind , ArrayList<Integer> arl , int sum , int req_sum , int[] arr , int n ){
        if(ind == n){
            if(sum == req_sum){
                for(Object x : arl){
                    System.out.print(x +" ");
                }
                System.out.println();
            }
            return ;
        }
        // Take condition
        arl.add(arr[ind]);
        sum = sum + arr[ind];
        print(ind+1 , arl , sum , req_sum , arr , n);

        //Not take condition
        arl.remove(arl.size() - 1);
        sum = sum - arr[ind];
        print(ind+1 , arl , sum , req_sum , arr , n);

    }
}
public class SubsequenceWithSumK {
    static void main() {
        int[] arr = {1 , 2 , 1};
        int n = arr.length;
        int req_sum = 2 ;
        ArrayList<Integer> arl = new ArrayList<>();
        SubsequenceWithSum sol = new SubsequenceWithSum();
        sol.print(0 , arl , 0,  req_sum , arr , n );
    }
}
