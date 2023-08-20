package Arrays;
import java.util.*;
import java.lang.*;
import java.sql.Array;
public class largest_kth_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b =sc.nextInt();
        System.out.print("enter the kth element ");
        int c = sc.nextInt();
        System.out.println();
        int array[]=new int[a];
        int largest=array[0];
        for(int i=0;i<a;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println(largest);
    }
}
