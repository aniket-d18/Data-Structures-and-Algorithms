//package Recursion;

void print(int i, int n){
    System.out.println(i);
    i++;
    if( i > n){
        return ;
    }
    print(i , n);
}
void main() {
    print(1 , 100);
}
