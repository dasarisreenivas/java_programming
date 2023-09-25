package sorting;
import java.util.*;
public class quick_sort {
    public static void main(String[]args){
        int arr[] = {2,3,1,7,9,0,7};
        int n = arr.length;
        System.out.println("Array before sorting");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Array after sorting");
        quicksort(arr,0,n-1);
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int arr[],int low,int high){
        if(low<high){
            int partition_index = partition(arr,low,high);
            quicksort(arr, low, partition_index-1);
            quicksort(arr,partition_index+1,high);
        }
    }
    public static int partition(int []arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
}
