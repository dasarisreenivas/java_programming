package Arrays;
import java.util.*; 
public class rotate_array_to_left {
    public static void main(String[]args){
   try(Scanner sc = new Scanner(System.in)){
    int k = sc.nextInt();
    int n = sc.nextInt();
    int arr[]= new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Array before rotation");
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    rotate_to_left(arr, n, k);
    System.out.println("Array after rotation");
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    }
    public static void reverse(int arr[],int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    public static void rotate_to_left(int arr[],int n,int k){
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
}
