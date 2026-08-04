package Recursion;
class Solution7{
    int i = 0 ;
    public boolean isPalindrone(String s){
        int left = 0 ;
        int right = s.length() - 1;
        while(left <= right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rightChar)){
                right--;
            }

            else{
                if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)){
                    return false ;
                }
                left++;
                right--;
            }
        }
        return true ;
    }

}
public class isPAlindromeCheck {
    public static void main() {
        Solution7 sol = new Solution7();
        sol.isPalindrone("Madam");
    }
}
