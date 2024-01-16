package Binary_search.binary_search_on_Arrays;

public class upper_bound_optimalsolution {
    public static void main(String[] args) {
        int []arr = {2,4,6,7};
        int n = arr.length;
        int x = 5;
        System.out.println(upperbpund(arr, n, x));
    }
    public static int upperbpund(int []arr,int n,int x){
        int low = 0;
        int high = n-1;
        //int ans = n;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]>x){
                //ans = mid;
                high = mid-1;
            }else{
                low= mid+1;
            }
        }
        return low;//return ans;
    }
}
/*time complexit = O(log n);
 * space complexity = O(1);
 */
