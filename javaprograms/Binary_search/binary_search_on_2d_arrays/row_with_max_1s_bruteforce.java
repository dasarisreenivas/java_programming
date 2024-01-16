package Binary_search.binary_search_on_2d_arrays;
import java.util.*;
public class row_with_max_1s_bruteforce {
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
        int maxcount = -1;
        for(int i  = 0;i<n;i++){
            int count = 0;
            for(int j = 0;j<m;j++){
                count =count+matrix.get(i).get(j);
            }
            if(count>maxcount){
                maxcount = count;
                index=i;
            }
        }
        return index;
    }
}
/*time complexity =  O(nxm) 
 * space complexity = O(1)
*/
