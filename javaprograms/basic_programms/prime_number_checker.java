package basic_programms;
import java.util.*;
class prime_number_checker{
    public static void main(String[] args) {
        int counter=0;
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                counter++;
            }
        }
        if(counter==2){
            System.out.println(n+" is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
        sc.close();
    }
    }
