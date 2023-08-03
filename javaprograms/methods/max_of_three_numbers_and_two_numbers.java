package methods;
import java.util.*;
class three_numbers_and_two_number{
    public int getdata(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }
    public int getdata(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
class max_of_three_numbers_and_two_numbers{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            three_numbers_and_two_number ds = new three_numbers_and_two_number();
            int m = sc.nextInt();
            int n = sc.nextInt();
            int o = sc.nextInt();
            System.out.println(ds.getdata(m,n,o));
            System.out.println(ds.getdata(m,n));

        }
    }
}