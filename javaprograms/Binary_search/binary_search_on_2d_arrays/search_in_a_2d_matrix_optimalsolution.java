package Binary_search.binary_search_on_2d_arrays;
public class search_in_a_2d_matrix_optimalsolution {
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},{5,6,7,8}};
        int target = 1;
        System.out.println(search(matrix, target));
    }
    public static boolean search(int[][]matrix,int target){
        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0;
        int high = (n*m)-1;
        while(low<=high){
            int mid = (low+high)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col]==target) return true;
            else if(matrix[row][col]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
