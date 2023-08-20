package Arrays;
import java.util.*;
public class second_smallest_element_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smallest =Integer.MAX_VALUE;
        int Ssmallest = Integer.MAX_VALUE;
        int no_elements=sc.nextInt();
        int array[]=new int[no_elements];
        for(int i =0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]<smallest){
                Ssmallest=smallest;
                smallest = array[i];
            }else if(array[i]<Ssmallest && array[i]>smallest){
                Ssmallest=array[i];
            }
        }
        System.out.println("-----------------------");
        System.out.println(smallest);
        System.out.println(Ssmallest);
    }
}
