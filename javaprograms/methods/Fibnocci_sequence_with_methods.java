package methods;
import java.util.*;
class Fib{
    public int getdata(int n){
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2);
        for(int i=0;i<n;i++){
            n3 = n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
        return (n+n2);
    
    }
    
}
class Fibnocci_sequence_with_methods{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in) ){
            int j =sc.nextInt();
            Fib ds = new Fib();
            ds.getdata(j);
            

        }
    }
}