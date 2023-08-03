package conditional_statements;
import java.util.*;
class if_statement{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of the a\n");
        int a = sc.nextInt();
        System.out.print("ente the value of the b\n");
        int b =sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than the "+b);
        }
        sc.close();
    }
}