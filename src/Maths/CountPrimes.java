package Maths;

class Solution204 {
    public int countPrimes(int n) {
        if(n <= 1){
            return 0 ;
        }
        if(n == 2){
            return 1 ;
        }
        int countprime = 0 ;
        for(int i = 1 ; i < n ; i++){
            int count = 0 ;
            if(i % 2 == 0 ) {
                continue;
            }
                for(int j = 1 ; j <= i ; j++ )
                    if(i % j == 0){
                        count++;
                    }
                if(count == 2){
                    countprime++;
                }
            }
            return countprime ;
        }
    }
public class CountPrimes {


    static void main() {
        Solution204 sol = new Solution204();
        sol.countPrimes(499979);
    }
}
