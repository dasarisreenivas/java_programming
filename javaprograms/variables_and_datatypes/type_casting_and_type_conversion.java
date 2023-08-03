package variables_and_datatypes;
//import java.lang.*;
class type_casting_and_type_conversion{
    public static void main(String[] args) {
        //double>>float>>long>>int>>char>>short>>byte
        //converting the larger sized datatypes to smaller sized data types of the certain value is known as the type casting
        double d = 1233.233;
        int i = (int)d;
        System.out.println("the value of d before casting "+d);
        System.out.println("the value of d after casting  "+i);
        float j = (float)d;
        System.out.println(j);
        long k =(long)d;
        System.out.println(k);
        int z =(int)d;
        System.out.println(z);
        char q = (char)d;
        System.out.println(q);
        short s = (short)d;
        System.out.println(s);
        byte b = (byte)d;
        System.out.println(b);
        //type_conversion
        //conersion of smaller data types to larger data types is known as the type conversions
        //byte>>short>>char>>int>>long>>float>>double
        byte v =1;
        double h = v;
        System.out.println(h);
        float m = v;
        System.out.println(m);
        int  Q =v;
        System.out.println(Q);
    }
}