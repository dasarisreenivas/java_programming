package variables_and_datatypes;
import java.util.*;
class Add_of_two_numbers_using_variables{
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        int a = ds.nextInt();
        int b =ds.nextInt();
        int c = a+b;
        System.out.println(c);
        ds.close();
    }
}