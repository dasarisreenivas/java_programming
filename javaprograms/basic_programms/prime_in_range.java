package basic_programms;
import java.util.*;
class prime_in_range{
    public static void main(String[] args) {
        int counter=0;
        Scanner ds = new Scanner(System.in);
        System.out.println("enter the min value");
        int min = ds.nextInt();
        System.out.println("enter the max value");
        int max = ds.nextInt();
        for(int i=min;i<=max;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    counter=1;
                    break;
                }
            }
            if(counter==0){
                System.out.println(i+" ");
            }
            counter = 0;
        }
        ds.close();
    }
}