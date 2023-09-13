package sorting;
import java.util.*;
public class selection_sort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size_of_array = sc.nextInt();
            int array[] = new int[size_of_array];
            for(int k=0;k<size_of_array;k++){
                array[k]=sc.nextInt();
            }
            int sortedarray[]=selectsort(array);
            for(int m=0;m<size_of_array;m++){
            System.out.print(sortedarray[m]+" ");
            }
        }
    }
    public static int[] selectsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
 