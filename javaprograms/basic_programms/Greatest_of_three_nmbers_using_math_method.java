package basic_programms;
import java.util.*;
class three_numbers_data{
    public int getdata(int a,int b,int c,int d){
        int max = Math.max(Math.max(a,b),Math.max(c,d));//i have done the 
        return max;
    }
}
class Greatest_of_three_nmbers_using_math_method{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            three_numbers_data ds = new three_numbers_data();
            int m = sc.nextInt();
            int n = sc.nextInt();
            int o = sc.nextInt();
            int p =sc.nextInt();
            System.out.print("greatest of three numbers is ");
            System.out.println(ds.getdata(m,n,o,p));
        }
    }
}