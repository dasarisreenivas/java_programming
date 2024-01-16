package Binary_search.binary_search_on_Arrays;

public class search_insert_position_optimalsolution {
    public static void main(String[] args) {
        int []arr = {1, 2, 4, 7};
        int n = arr.length;
        int x = 6;
        System.out.println(searchinsertposition(arr, n, x));   
    }
    public static int searchinsertposition(int []arr,int n,int x){
        int low = 0;
        int high = n-1;
        while (low<=high){
            int mid =(low+high)/2;
            if(arr[mid]>=x) high = mid-1;
            else low =mid+1;
            
        }
        return low;
    }
}
