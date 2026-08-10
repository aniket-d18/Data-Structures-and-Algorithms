package Maths;
class Solution258 {
    public int addDigits(int num) {
        int sum = 0; ;
        int temp = num ;
        while(temp > 0){
            int lastdigit = temp % 10 ;
            sum = sum + lastdigit ;
            temp = temp / 10 ;
        }
        if(sum < 10){
            return sum ;
        }
        return addDigits(sum) ;

    }
}
public class LC258 {
    static void main() {
        Solution258 sol = new Solution258();
        System.out.println(sol.addDigits(39));

    }
}
