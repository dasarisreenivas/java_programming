package sorting;
import java.util.*;
public class merge_sorting {
    public static void main(String[]args){
    try(Scanner sc = new Scanner(System.in)){
    int n = sc.nextInt();
    int arr[]= new int[n];
    int low = 0;
    int high = n-1;
    for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("array before sorting");
    for(int j =0;j<=high;j++){
        System.out.print(arr[j]+" ");
    }
    System.out.println("array after sorting");
    sorting.mergsort(arr,low,high);
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
}
class sorting{
    public static  void mergsort(int arr[],int low,int high){
        if(low>=high) return ;
        int mid = (low+high)/2;
        mergsort(arr, low, mid);
        mergsort(arr, mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right= mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i =low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
}
