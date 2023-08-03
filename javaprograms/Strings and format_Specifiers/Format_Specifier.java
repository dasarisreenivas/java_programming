import java.util.*;
class Format_Specifier{
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        //program for the different types of format specifiers
        /*%d is for integers
         %s is for Strings
         %c is for charcters
         %f is for float values
         */
        int i =s.nextInt();
        System.out.printf("%d",i);
        float j = s.nextFloat();
        System.out.printf("%f",j);
        double d = s.nextDouble();
        System.out.printf("%f",d);
        char a =s.next().charAt(0);
        System.out.printf("%c",a);
        s.close();
    }
}