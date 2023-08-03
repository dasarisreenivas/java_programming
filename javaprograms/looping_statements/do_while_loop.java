package looping_statements;
import java.util.*;
class do_while_loop{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int i = sc.nextInt();
            int n= sc.nextInt();
            do{
                System.out.println(i);
                i++;
            }while(i<=n);
        }
    }
}