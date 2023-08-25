package Recursions;
import java.util.*;
public class sum_of_n_numbers_functional_way {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(function(sc.nextInt()));
        sc.close();
    }
    public static int function(int num ){
        if(num==0){
            return 0;
        }
        return num+function(num-1);
    }
}
