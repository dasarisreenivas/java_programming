import java.util.*;
class Spaces_Using_Format_Specifiers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//for integers
        float b = sc.nextFloat();//for decimals
        double c =sc.nextDouble();
        long l=sc.nextLong();
        double d = sc.nextDouble();
        String s = sc.next();
        int num = sc.nextInt();
        String hexStr = Integer.toHexString(num);
        String octStr = Integer.toOctalString(num);
        System.out.printf("|%5d|\n",a);
        System.out.printf("|%2.8f|\n",b);//here the output included integer value also
        System.out.printf("|%2.10f|\n",c);
        System.out.printf("|%10d|\n",l);
        System.out.printf("|%10.2e|\n",d);//to print the expponential numbers
        System.out.printf("|%20s|",s);
        System.out.printf("|%s|",hexStr);
        System.out.printf("|%s|",octStr);
        Formatter formatter = new Formatter();
        formatter.format("%x",num);
        System.out.println(formatter);
        formatter.format("%o",num);
        System.out.println(formatter);
        sc.close();
    }
}