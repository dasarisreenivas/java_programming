package sorting;
import java.util.*;
public class insertion_sort {
   /* *public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size_of_array = sc.nextInt();
        int array[]= new int[size_of_array];
        for(int i=0;i<size_of_array;i++){
            array[i]=sc.nextInt();
        }
        int selectionsorted[] = selectionsort(array,size_of_array);
        for(int j=0;j<size_of_array;j++){
            System.out.print(selectionsorted[j]+" ");
        }
    }
    public static int [] selectionsort(int arr[],int size){
        for(int k = 0;k<size;k++){
            for(int m = k;m>0;m--){
                if(arr[m-1]>arr[m]){
                    int temp = arr[m-1];           //time complexity O(n^2) worstcase and average case
                    arr[m-1]=arr[m];
                    arr[m]=temp;
                }
            }
        }
        return arr;

    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size_of_array = sc.nextInt();
        int array[]= new int[size_of_array];
        for(int i=0;i<size_of_array;i++){
            array[i]=sc.nextInt();
        }
        int selectionsorted[] = selectionsort(array,size_of_array);
        for(int j=0;j<size_of_array;j++){
            System.out.print(selectionsorted[j]+" ");
        }
    }
    public static int [] selectionsort(int arr[],int size){
        for(int k = 0;k<size;k++){
            int didswap=0;
            for(int m = k;m>0;m--){
                if(arr[m-1]>arr[m]){
                    int temp = arr[m-1];           //time complexity O(n) bestcase 
                    arr[m-1]=arr[m];
                    arr[m]=temp;
                    didswap=1;
                }
                 if(didswap==0){
                break;
            }
            System.out.println("swaped");
            }
        }
        return arr;

    }

}
/*using the while loop */
/*for(int i =0;i<arr.length;i++){
    int j = i;
    while(j>0 && arr[j-1]>arr[j]){
        int temp = arr[j-1];
        arr[j-1]=arr[j];
        arr[j]=temp;
        j--;
    }
} 
return arr;
*/
