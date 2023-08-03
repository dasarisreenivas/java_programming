package basic_programms;
import java.util.*;
class Reversing_the_number{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a =0;
        int n = sc.nextInt();
        while(n>0){
        int r=n%10;
        a =a*10+r;
        n=n/10;
    }
    sc.close();
    System.out.println(a);
}
}