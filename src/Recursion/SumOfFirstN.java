int sum  = 0  , count = 0;
void sum(int n){
    sum += count;
    count++;
    if(count > n ){
        return ;
    }
    sum(n);
}
void main() {
    sum(4);
    System.out.println(sum);
}