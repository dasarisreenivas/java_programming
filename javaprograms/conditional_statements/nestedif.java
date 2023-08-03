package conditional_statements;
import java.util.*;
class nestedif{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for a");
        int a = sc.nextInt();
        System.out.println("enter the value for b");
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater than the "+b);
            if(b>0){
                System.out.println(a+b);
            }
        }
        sc.close();
    }
}