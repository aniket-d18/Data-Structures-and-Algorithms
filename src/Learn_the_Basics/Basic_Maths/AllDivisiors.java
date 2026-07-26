package Learn_the_Basics.Basic_Maths;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Divisiors{
    public void divi(int n) {
//        for (int i = 1; i < n ; i++) {
//            if(n % i == 0){
//                System.out.print(i + " ");
//            }
//        }
        ArrayList<Integer> arl = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                arl.add(i);
                if (i != n / i) {  // avoid duplicate when i == sqrt(n)
                    System.out.print((n / i) + " ");
                    arl.add(n/i);
                }
            }

        }
        System.out.println();
        Collections.sort(arl);
        for(int r : arl){
            System.out.print(r + " ");
        }
    }
}
public class AllDivisiors {
    public static void main(String[] args) {
        Divisiors divisiors = new Divisiors();
        divisiors.divi(56);
    }
}
