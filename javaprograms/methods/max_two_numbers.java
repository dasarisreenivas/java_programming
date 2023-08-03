package methods;
import java.util.*;
class two_numbers_data{
    public int getdata(int a,int b){
        if(a>b){
            return (a);
        }else{
            return b;
        }
    }
}
class max_two_numbers{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
           two_numbers_data ds = new two_numbers_data();
            int m = sc.nextInt();
            int n =sc.nextInt();
            System.out.println(ds.getdata(m,n));
        }catch(Exception e){
            System.out.println("this is an exception");
            e.printStackTrace();
        }
    }
}