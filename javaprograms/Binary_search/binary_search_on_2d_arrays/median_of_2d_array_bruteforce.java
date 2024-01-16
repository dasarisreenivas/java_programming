package Binary_search.binary_search_on_2d_arrays;
import java.util.*;
public class median_of_2d_array_bruteforce {
    public static void main(String[] args) {
        int [][]matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println(median(matrix, n, m));
    }
    public static int median(int [][]matrix,int n ,int m){
        List<Integer> ls  = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                ls.add(matrix[i][j]);
            }
        }
        Collections.sort(ls);
        return ls.get((n*m)/2);
    }
}
/*time complexity = O(n*m)+O(n*m log(n*m)) 
 * space complexity = O(n*m)
*/
