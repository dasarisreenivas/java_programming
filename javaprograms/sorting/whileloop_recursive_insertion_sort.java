package sorting;
import java.util.*;
public class whileloop_recursive_insertion_sort {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i =0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("array after  sort");
            while_insertion_sort(arr, 0, n);
            for(int i =0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void while_insertion_sort(int arr[],int i,int n){
        if(i==n) return ;
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        while_insertion_sort(arr, i+1, n);
    }
}
