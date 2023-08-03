package methods;
import java.util.*;
class three_numbers{
    public int getdata(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        }else{
            return c;
        }
    }

}
class max_of_three_numbers{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            three_numbers ds = new three_numbers();
            int m = sc.nextInt();
            int n = sc.nextInt();
            int o = sc.nextInt();
            System.out.println(ds.getdata(m,n,o));

        }
    }
}