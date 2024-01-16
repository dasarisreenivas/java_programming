package Binary_search.binary_search_on_2d_arrays;
import java.util.*;
public class row_with_max_ones_optimalsolution {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(0,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,0,0)));
        int n  = 3;
        int m  = 3;
        System.out.println(maxones(matrix,n,m));
    }
    public static int  maxones(ArrayList<ArrayList<Integer>> matrix,int n, int m){
        int index=-1;
        int maxcount=0;
        for(int i = 0;i<n;i++){
            int count = m-lowwerbound(matrix.get(i), m, 1);
            if(count>maxcount){
                maxcount = count;
                index = i;
            }
        }
        return index;
    }
    public static int lowwerbound/*upperbound or first occurence */(ArrayList<Integer> arr,int m ,int x){
        int low = 0;
        int high = m-1;
        int ans = m;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr.get(mid)>=x){
                ans = mid;
                high = mid-1;
            }else low = mid+1;
        }
        return ans;
    }
}
