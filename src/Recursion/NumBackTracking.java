void print(int i , int n){

    if( i < 1){
        return ;
    }
    print(i - 1 , n);
    System.out.println(i);
}

void main() {

    print(10 , 10);
}