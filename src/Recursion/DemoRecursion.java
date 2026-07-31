package Recursion;

class recursio{
    int count = 0 ;
    void show(){
        if(count > 10){
            return;
        }
        System.out.println(count);
        count ++ ;
        show();
    }

}
public class DemoRecursion {

    public static void main(String[] args) {
        recursio recursio = new recursio();
        recursio.show();
    }


}
