package Arrays;
import java.util.*;
public class largest_elements_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.print(list);
        Object []array = list.toArray();
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        int largest=(int) array[0];
        int k=3;
        for(int i=0;i<n;i++){
            if(((int)array[i])>largest){
                largest=(int)array[i];
            }
        }
        System.out.println();
        System.out.println(largest);
    }
}
