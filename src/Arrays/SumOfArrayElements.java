package Arrays;
class SolutionArraySum {
    public  int sum(int arr[], int n) {
        int sum = 0 ;
        for(int i : arr){
            sum += i;
        }
        return sum ;
    }
}

public class SumOfArrayElements {

    static void main() {
        SolutionArraySum sol = new SolutionArraySum();
        int[] arr = {1 , 2, 3, 4, 5};
        System.out.println(sol.sum(arr , 5));
    }
}
