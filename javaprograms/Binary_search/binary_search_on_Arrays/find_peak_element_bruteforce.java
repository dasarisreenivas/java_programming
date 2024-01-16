package Binary_search.binary_search_on_Arrays;

public class find_peak_element_bruteforce {
    public static void main(String[] args) {
        int []arr = {3,1,5,6,10,9};
        int n = arr.length;
        System.err.println(peak_element(arr, n));
    }
    public static int peak_element(int[]arr,int n){
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            maxi =Math.max(maxi,arr[i]);
        }
        return maxi;
    }
}
