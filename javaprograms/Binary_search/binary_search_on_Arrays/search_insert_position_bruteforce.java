package Binary_search.binary_search_on_Arrays;

public class search_insert_position_bruteforce {
    public static void main(String[] args) {
        int []arr = {1, 2, 4, 7};
        int n = arr.length;
        int x = 6;
        System.out.println(searchinsertposition(arr, n, x));
    }
    public static int searchinsertposition(int[]arr,int n,int x){
        for(int i = 0;i<n;i++){
            if(arr[i]>=x) return i;
        }
        return n;
    }
    
}
/*time complexity = O(n);
 * space complexity = O(1);
 */
