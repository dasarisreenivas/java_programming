package conditional_statements;
import java.util.*;
class ifelse_statement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value for a");
        int a = sc.nextInt();
        System.out.print("enter the value for b");
        int b =sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than the "+b);
        }else{
            System.out.println(a+" is less than the "+b);
        }
        sc.close();
    }
}