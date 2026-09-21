package Maths;
class SolutionCountOddDigits {
    public int countOddDigit(int n) {
        int count = 0 ;
        while(n > 0){

            int lastdigit = n % 10 ;

            if(lastdigit % 2 == 1){
                count++;
            }
            n = n / 10 ;
        }
        return count ;
    }
};
public class CountOddDigits {


    static void main() {
        SolutionCountOddDigits sol = new SolutionCountOddDigits();
        System.out.println(sol.countOddDigit(157));
    }
}
