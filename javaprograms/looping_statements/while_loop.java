package looping_statements;
import java.util.*;
class while_loop{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int i= sc.nextInt();
            int n = sc.nextInt();
            while(i<=n){
                System.out.println(i);
                i++;
            }
            System.out.println("while loop running completed");
              /*  while(true){
                System.out.println(i);
                i++;
            } */
        }
    }
}