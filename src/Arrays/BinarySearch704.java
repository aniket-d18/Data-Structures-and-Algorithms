package Arrays;
class Solution704 {
    public int search704(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length - 1;

        while(low <= high){
            int mid = low + ( high - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1 ;
            }
        }
        return -1;
    }

}
public class BinarySearch704 {
    static void main() {
        Solution704 sol = new Solution704();
        int[] nums = {-1 , 0 , 3 , 5 , 8 , 12};
        System.out.println(sol.search704(nums , 9));
    }
}
