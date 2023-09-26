package Arrays;
import java.util.*;
public class remove_duplicates_in_array_brute_force {
    public static void main(String[]args){
        try(Scanner sc =new Scanner(System.in)){
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        removing_elements(arr,n);
    }
}
public static void removing_elements(int arr[],int n){
    Set<Integer> st = new HashSet<Integer>();
    for(int i =0;i<n;i++){
        st.add(arr[i]);
    }
    int index=0;
    for(int it : st){
        arr[index]=it;
        index++;
    }
    for(int i=index;i<n;i++){
        arr[i]=0;
    }
    System.out.println(index);
    for(int i =0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}
