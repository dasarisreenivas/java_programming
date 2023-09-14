package sorting;
import java.util.*;
/*public class bubble_sort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size_of_array = sc.nextInt();
            int array[] = new int[size_of_array];
            for(int i=0;i<size_of_array;i++){
                array[i]=sc.nextInt();
            }
            int []bubblesorted=bubblesort(array,size_of_array);
            for(int k =0;k<size_of_array;k++){
                System.out.print(bubblesorted[k]+" ");
            }
        }
    }
    public static int [] bubblesort(int arr[],int size){
        for(int j=size-1;j>=1;j--){
            for(int m=0;m<j;m++){
                if(arr[m]>arr[m+1]){
                    int temp = arr[m];
                    arr[m]=arr[m+1];                    //time complexity for this code is O(n^2); worst case and average case
                    arr[m+1]=temp;
                }
            }
        }
        return arr;
    }
}*/
public class bubble_sort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int size_of_array = sc.nextInt();
            int array[] = new int[size_of_array];
            for(int i=0;i<size_of_array;i++){
                array[i]=sc.nextInt();
            }
            int []bubblesorted=bubblesort(array,size_of_array);
            for(int k =0;k<size_of_array;k++){
                System.out.print(bubblesorted[k]+" ");
            }
        }
    }
    public static int [] bubblesort(int arr[],int size){
        for(int j=size-1;j>=1;j--){
             int didswap =0;
            for(int m=0;m<j;m++){
                if(arr[m]>arr[m+1]){
                    int temp = arr[m];
                    arr[m]=arr[m+1];                    //time complexity for this code is O(n); best case
                    arr[m+1]=temp;
                    didswap = 1;
                }
            }
            if(didswap==0){
                break;
            }
            System.out.println("swaped");
        }
        return arr;
    }
} 
/*public class Main
{
	public static void main(String[] args) {
	    int arr[]= {13,9,15,52,1,3};
	    for(int m=0;m<arr.length;m++){
	        System.out.println(arr[m]+" ");
	    }
	    int n = arr.length;
	    for(int i=arr.length-1-1;i>=1;i--){
	        for(int j=0;j<=i;j++){
	            if(arr[j]>arr[j+1]){
	                int temp =arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }
	    for(int k=0;k<arr.length;k++){
	        System.out.println(arr[k]+" ");
	    }
	}
}*/
