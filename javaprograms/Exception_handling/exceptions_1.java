package Exception_handling;

import java.util.Arrays;

public class exceptions_1{
    public static void  main(String[] nums) {
        method2();
    }
    public static void method1() throws ArithmeticException{
        int a =10;
        int b=0;
        int c=0;
        try{
            c=a/b;
        }catch(ArithmeticException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            throw e;
        }
        finally{
            System.out.println("finally block");
        }
        System.out.println(c);
        System.out.println("program executed");
    }
    
    public static void method2(){
        method1();
    }
   
}