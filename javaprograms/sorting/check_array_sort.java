package sorting;
import java.util.*;
public class check_array_sort {
    public static void main(String[]args){
        try(Scanner sc =new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] =  new int[n];
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(chech_sorting(arr,n));
        }
    }
    public static boolean chech_sorting(int arr[],int n){
        for(int j =1;j<n;j++){
            if(arr[j-1]<=arr[j]){

            }else return false;
        }
        return true;
    }
}
