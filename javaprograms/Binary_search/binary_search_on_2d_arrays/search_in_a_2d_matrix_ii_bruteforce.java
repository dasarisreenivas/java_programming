package Binary_search.binary_search_on_2d_arrays;

public class search_in_a_2d_matrix_ii_bruteforce {
    public static void main(String[] args) {
        int [][]matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int n = matrix.length;
        int m = matrix[0].length;
        int target = 15;
        System.out.println(targetelement(matrix, n, m, target));

    }
    public static boolean targetelement(int[][]matrix,int n,int m,int target){
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                if(matrix[i][j]==target) return true;
            }
        }
    return false;
    }
}
/*time complexity = O(n*m) 
  space complexity = O(1).
*/