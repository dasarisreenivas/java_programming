package sorting;
import java.util.*;
public class recursive_bubblesort {
    public static void main(String[]argd){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Array befor sorting");
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("Array after sorting");
            bubble_sort(arr,n);
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }

        }
    }
    public static void bubble_sort(int arr[],int n){
        if(n==1) return ;
        int didswap=0;
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]= temp;
                didswap=1;
            }
        }
        if(didswap ==0) return;
        bubble_sort(arr,n-1);
    }
}
