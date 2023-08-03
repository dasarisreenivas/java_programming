package methods;
import java.util.*;
class Cpu{
    public void getdata(int m,int n){
        if(m>n){
            System.out.println(m+n);
            System.out.println(m-n);
            System.out.println(m*n);
            System.out.println(m%n);
        }
        else{
            System.out.println(m/n);
        }

    }
}
class Operation{
    public static void main(String[]ar){
        try(Scanner sc = new Scanner(System.in)){
            Cpu ds = new Cpu();
            int a = sc.nextInt();
            int b = sc.nextInt();
            ds.getdata(a,b);
        }catch(Exception e){
            System.out.print(e);
            e.printStackTrace();
        }
    }
}