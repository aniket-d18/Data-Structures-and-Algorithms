package Arrays;
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length - 1 ;
        int mid ;
        while(low <= high)
        {
            mid = low + (high - low) / 2 ;
            if( nums[mid] == target)
            {
                return mid ;
            }
            else if( nums[mid] > target)
            {
                high = mid - 1 ;
            }
            else
            {
                low = mid + 1 ;
            }

        }
        return low ;
    }
}
public class SearchInsertPosition {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] nums = nums = new int[]{1, 2, 4, 6, 8};

        System.out.println(sol.searchInsert(nums , 8));
    }
}
