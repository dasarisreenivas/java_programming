package Arrays;
import java.util.*;
public class remove_duplicates_in_array_optimal_force {
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
    public static void removing_elements(int []arr,int n){
        int i =0;;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]= arr[j];
                i++;
            }
        }
       for(int k=0;k<arr.length;k++){
           System.out.println(arr[k]);
    }
} 
