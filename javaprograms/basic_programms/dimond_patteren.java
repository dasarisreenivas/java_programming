package basic_programms;
import java.util.*;
public class dimond_patteren{
    public static void main(String[] args) {
        try(Scanner ds = new Scanner(System.in)){
            int n= ds.nextInt();
            for(int i =1;i<n;i++){
                for(int k=3;k>=i;k--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for(int i=1;i<=n;i++){
                for(int k=1;k<=i;k++){
                    System.out.print(" ");
                }
                for(int j =1;j<n-i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}