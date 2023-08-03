package methods;
import java.util.*;
class max{
    public int getdata(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
class Max_of_two_numbers{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            max ds = new max();
            int m = sc.nextInt();
            int n =sc.nextInt();
            System.out.println(ds.getdata(m,n));
        }
    }
}