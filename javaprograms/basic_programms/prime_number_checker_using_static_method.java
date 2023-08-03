package basic_programms;
import java.util.*;
class prime_number_checker_using_static_method{
    public static void primechecker(int n){
        int counter=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                counter++;
            }
        }
            if(counter==2){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not aprime number");
            }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        primechecker(a);
        sc.close();
    }
}