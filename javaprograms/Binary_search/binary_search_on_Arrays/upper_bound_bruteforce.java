package Binary_search.binary_search_on_Arrays;

public class upper_bound_bruteforce {
    public static void main(String[] args) {
        int []arr = {3,1,5,5,6,10,9};
        int n = arr.length;
        int x = 3;
        System.out.println(upperbpund(arr, n, x));
    }
    public static int upperbpund(int arr[],int n,int x){
        for(int i = 0;i<n;i++){
            if(arr[i]>x) return arr[i];
        }
        return -1;
    }
}
/*time complexity = O(n);
 * space complexity = O(1);
 */