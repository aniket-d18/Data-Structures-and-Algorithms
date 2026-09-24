import static java.util.Collections.checkedCollection;
import static java.util.Collections.swap;

    public static ArrayList<Character> helper(ArrayList<Character> s , int start , int end){
    if(start >= end){
        return s;
    }
    Collections.swap(s , start , end);
    return helper(s , start+1 , end-1);
}

public static ArrayList<Character> reverseString(ArrayList<Character> s) {
    return helper(s , 0 , s.size() - 1);

}
static void main() {
        ArrayList<Character> s = new ArrayList<>();
    Collections.addAll(s, 'h', 'e', 'l', 'l', 'o');
    System.out.println(reverseString(s));
}
