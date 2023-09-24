package sorting;
import java.util.*;
public class recursive_insertionsort {
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
        insertion_sort(arr, 0, n);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
    public static void insertion_sort(int arr[],int i,int n){
        if(i==n) return ;
        int didswap = 0;
        for(int j =i;j>0;j--){
            if(arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                didswap=1;
            }
            if(didswap==0) return;
        }
        insertion_sort(arr, i+1, n);
    }
}
