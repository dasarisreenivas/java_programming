package basic_programms;
import java.util.*;
class Number_data{
    public String getdata(int a){
        if(a%2==0){
            System.out.print(a);
            return " is a even number";
        }else{
            System.out.print(a);
            return " is not a even number";
        }
    }
}
public class Even_or_Odd{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int b = sc.nextInt();
            Number_data ds = new Number_data();
            System.out.println(ds.getdata(b));
        }
    }
}