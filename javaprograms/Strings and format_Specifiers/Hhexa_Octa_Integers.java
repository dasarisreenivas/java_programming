import java.util.*;
class Hhexa_Octa_Integers{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        String hexStr= Integer.toHexString(a);
        String octaStr = Integer.toOctalString(a);
        System.out.println("the hexa decimal number is"+hexStr);
        System.out.println("octa decimal number is"+octaStr);
        //same program using the format specifiers
        System.out.format("%s\n",hexStr);
        System.out.format("%s\n",octaStr);
        sc.close();
    }
}