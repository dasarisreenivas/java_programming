package conditional_statements;
import java.util.*;
class operators{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //arithmetic operators
       System.out.println(a+b);
       System.out.println(a-b);
       System.out.println(a/b);
       System.out.println(a%b);
       //relational_operarors
       if(a>b){
        System.out.println("a is greater then b");
       }else{
        System.out.println("b is greater than a");
       }
       if(a<b){
        System.out.println("a is less than b");
       }else{
        System.out.println("a is greate than b");
       }
       if(a==b){
        System.out.println(" both a and b are equal");
       }else{
        System.out.println("both a and b are not equal");
       }
       if(a!=b){
        System.out.println("here a and b are not equal");
       }else{
        System.out.println("here a and b are equal");
       }
       if(a>=b){
        System.out.println("a is greater than b are equal to b");
       }else{
        System.out.println("not");
       }
       if(a<=b){
        System.out.println("a is less thsn or equal to b or equal to b");
       }
       else{
        System.out.println("not");
       }
       //logical operarors
       if(a>b && b>c){
        System.out.println("true");
       }else{
        System.out.println("false");
       }
       if(a>b || b>c){
        System.out.println("true");
       }else{
        System.out.println("false");
       }
       if(!(a>b)){
        System.out.println(!(a>b));
       }
       System.out.println(a&b);//odd number of desimal numbers
       System.out.println(a|b);//even number of decimal numbers
       System.out.println(a^b);//if the two decimal numbers are same then we treate them as the aero and different numbers as the one
       System.out.println(~b);
       //assignment operators
       System.out.println(a+=a);
       System.out.println(a-=a);
       System.out.println(a*=a);
       try{
       System.out.println(a/=a);
       }catch(Exception e){
        System.out.println("this  ia an java exception");
       }
       try{
       System.out.println(a%=a);
       }catch(Exception e){
        System.out.println("this a zero divisiion exception");
       }
       //shift operators
       System.out.println(a<<1);//signed left shift
       System.out.println(a>>1);//signed right shift
       System.out.println(a>>>3);//unsigned right shift
       //ternary operator
       int max = (a>b)?a:b;
       System.out.println(max);
       //unary operators
       System.out.println(++a);//preincrerment
       System.out.println(a++);//postincrement
       System.out.println(--a);//predecrement
       System.out.println(a--);//postdecrement32
       sc.close();
    }
}