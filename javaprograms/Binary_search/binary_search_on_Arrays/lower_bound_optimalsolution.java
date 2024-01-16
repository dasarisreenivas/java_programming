package Binary_search.binary_search_on_Arrays;

public class lower_bound_optimalsolution {
    public static void main(String[] args) {
        int []arr = {3,1,5,5,6,10,9};
        int n = arr.length;
        int x = 5;
        System.out.println(lowerbound(arr, n, x));
    }
    public static int lowerbound(int arr[],int n,int x){
        int low = 0;
        int high  = n-1;
        //int ans = n;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                //ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return  low;//return ans
    }
}
/*time complexity = O(log n) 
 * space complexity = O(1)
*/
