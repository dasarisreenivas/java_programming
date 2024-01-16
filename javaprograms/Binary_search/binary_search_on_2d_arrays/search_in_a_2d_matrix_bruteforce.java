package Binary_search.binary_search_on_2d_arrays;
public class search_in_a_2d_matrix_bruteforce{
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},{5,6,7,8}};
        int target = 20;
        System.out.println(search(matrix, target));
    }
    public static boolean search(int matrix[][],int target){
        int  n = matrix.length;
        int  m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==target) return true;
            }
        }
        return false;
    }
}
