package looping_statements;
import java.util.*;
class for_loop{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            for(int i=1;i<=n;i=i+2){
                System.out.println(i);
            }
            int j = sc.nextInt();
            for(int i=j;i!=0;i--){
                System.out.println(i);
            }
        }
    }
}