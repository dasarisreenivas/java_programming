package Recursions;
import java.util.*;
public class revesing_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]={1,2,3,4,5};
        rev(arr,0,a-1);
        printarray(arr,a);
        sc.close();
    }
    public static void rev(int arr[],int start,int end){
        if(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            rev(arr,start+1,end-1);
        }
    }
    public static void printarray(int arr[],int a){
        for(int i=0;i<a;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
