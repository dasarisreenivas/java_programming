package Binary_search.binary_search_on_Arrays;
public class find_the_peak_element_optimalsolution {
    public static void main(String[] args) {
        int []arr = {3,1,5,6,10,9};
        int n = arr.length;
        System.err.println(peak_element(arr, n));
    }
    public static int peak_element(int[]arr,int n){
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int low = 1;
        int high = n-2;
        while(low<=high){
            int mid=  (low+high)/2;
            if(arr[mid-1]>arr[mid] && arr[mid+1]>arr[mid]) low=mid+1;
            else if(arr[mid-1]<arr[mid]) low=mid+1;
            else high = mid-1;
        }
        return low;
    }
}
