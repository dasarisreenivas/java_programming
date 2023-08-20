package Arrays;
import java.util.*;
public class smallest_element_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_elements = sc.nextInt();
        int array [] = new int[number_of_elements];
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]<smallest){
                smallest=array[i];
            }
        }
        System.out.println(smallest);
    }
}
