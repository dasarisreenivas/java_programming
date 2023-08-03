package basic_programms;
import java.util.*;
class info{
    public int getdata(int m,int n,int number){
        int a =1;
        int b=2;
        int c =3;
        int d=4;
        if(number ==a){
            return (m+n);
        }else if(number ==b){
            return (m-n);
        }else if(number ==c){
            return (m*n);
        }else if(number ==d){
            return (m/n);
        }
        return 0;
    }
}
class Simple_calculator{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            info ds = new info();
            int k= sc.nextInt();
            int  p=sc.nextInt();
            int num = sc.nextInt();
           System.out.println(ds.getdata(k,p,num));
        }
    }
}