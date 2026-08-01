
void print(int i , int n){
    System.out.println(i);
    if(i < 1){
        return;
    }
    print(i - 1 , n);
}
void main() {
    print(10 , 10);
}