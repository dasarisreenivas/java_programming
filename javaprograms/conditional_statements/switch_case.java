package conditional_statements;
import java.util.*;
class switch_case{
    public static void hello(int age){
        switch(age){
            case 18:
            System.out.println("you are eligible to vote");
            break;
            case 17:
            System.out.println("you are not eligible to vote");
            break;
            default:
            System.out.println("thank you for checking ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        hello(a);
        sc.close();


    }
}