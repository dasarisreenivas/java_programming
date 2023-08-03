package basic_programms;
import java.util.*;
class fibnacci_of_nth_number{
    static int fib(int count){
        if(count<=1){
            return count;
        }
        return(fib(count-1)+fib(count-2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do{
        a = sc.nextInt();
        System.out.println(fib(a));
        }while((a>1));
        sc.close();
    }
}