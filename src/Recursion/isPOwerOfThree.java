
public boolean isPowerOfthree(int n){
    for (int i = 0; i < n/2; i++) {
       int base = 3 ;
       int power = i ;
       double result = Math.pow(base , power) ;
        if(result == n) {
            return true ;
        }
    }
    return false ;
}

void main() {
    System.out.println(isPowerOfthree(1));
}