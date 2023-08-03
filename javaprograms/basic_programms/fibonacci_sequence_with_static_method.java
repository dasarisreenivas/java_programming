package basic_programms;
import java.util.*;
class fibonacci_sequence_with_static_method{
    static int n1=0,n2=1,n3,count;
    static int fib(int count){
        System.out.print(n1+" "+n2);
        for(int i=3;i<count;i++){
            n3= n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        return(n1+n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        System.out.print(fib(a));
        sc.close();
    }
}