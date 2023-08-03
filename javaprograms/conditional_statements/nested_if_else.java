package conditional_statements;
import java.util.*;
class nested_if_else{
        public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter the a value");
        int a = c.nextInt();
        System.out.println("enter the b value");
        int b =c.nextInt();
        if(a>b){
            System.out.println(a+" is greater than "+b);
            if(a>0){
                System.out.println(a+b);
            }else{
                System.out.println(a-b);
            }
        }else{
            System.out.println(b+" is greater than "+a);
            if(b>0){
                System.out.println(a*b);
            }else{
                System.out.println(a/b);
            }
        }
        c.close();
    }
}