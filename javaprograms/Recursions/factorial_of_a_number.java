package Recursions;
import java.util.*;
public class factorial_of_a_number {
    public static int fact(int number){
        if(number!=0){
        return number*fact(number-1);
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fact(sc.nextInt()));
        sc.close();
    }
}
