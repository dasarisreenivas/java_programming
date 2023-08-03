package variables_and_datatypes;
import java.util.*;
class Data_Types{
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        //integer data types are byte,short,int,long
        byte a =ds.nextByte();//1_byte
        System.out.println(a);
        short b = ds.nextShort();//2_bytes
        System.out.println(b);
        int c = ds.nextInt();//4_bytes
        System.out.println(c);
        long d = ds.nextLong();//8_bytes
        System.out.println(d);
        //realnumber  data types are float,double
        float e =ds.nextFloat();//4_bytes
        System.out.println(e);
        double f =ds.nextDouble();//8_bytes
        System.out.println(f);
        //character datatype
        String s;
        s = ds.next();//2_bytes
        System.out.println(s);
        ds.nextBoolean();//1_byte
        ds.close();
    }
}