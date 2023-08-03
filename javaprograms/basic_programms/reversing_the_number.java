package basic_programms;
import java.util.*;
public class reversing_the_number{
    public static int getReversingNumber(int number){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
        return n;
    }
}
    public static void main(String[]args){
        int rem;
        int p=0;
        int reversing_number=getReversingNumber(1);
        while(reversing_number>0){
            rem=reversing_number%10;
            p=p*10+rem;
            reversing_number=reversing_number/10;
        }
        System.out.println(p);
    }
}