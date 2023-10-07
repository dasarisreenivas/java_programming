package Arrays;
import java.util.*;
public class two_sum_yes_or_no_output_optimal {
    public static void main(String[] args) {
        int arr[]={4,1,2,3,1};
        int target =5 ;
        String result = two_sum(arr,target);
        System.out.print(result);
    }
    public static String two_sum(int arr[],int target){
        int low = 0;
        int high = arr.length-1;
        mergesort(arr, low, high);
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int sum = arr[first]+arr[last];
            if(sum==target){
                return "YES";
            }else if(sum<target) first++;
            else last--;
        }
        return "NO";
    }
    public static void mergesort(int arr[],int low,int high){
        if(low>=high) return ; 
        int mid =(low +high)/2; 
        mergesort(arr, low, mid);
        mergesort(arr, mid+1,high);
        merge(arr,low,mid,high);
    }
    private static void merge(int arr[],int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int left = low;
        int right = mid+1;
        while (left<=mid && right<=high){
            if(arr[left]<arr[mid]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
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
}
