/*import java.io.*;*/
import java.util.*;
class Integer_String_Conversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String str = Integer.toString(a);
        System.out.printf("%s",str);
        int b = sc.nextInt();
        String str1 = String.valueOf(b);
        System.out.printf("%s",str1);
        double c = 10.0;
        String z = Double.toString(c);
        System.out.println(z);
        sc.close();
    }
}