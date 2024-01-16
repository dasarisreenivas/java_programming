package Binary_search.binary_search_on_2d_arrays;

public class search_in_a_2d_matrix_bettersolution {
    public static void main(String[] args) {
       int [][]matrix= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int n = matrix.length;
        int m = matrix[0].length;
        int target = 15;
        System.out.println(target_element(matrix, n, m, target));
    }
    public static boolean target_element(int[][]matrix,int n,int m,int target){
        for(int i = 0;i<n;i++){
            if(Binary_search(matrix[i], m, target)) return true;
        }
        return false;
    }
    public static boolean Binary_search(int[]mat,int m,int target){
        int low = 0;
        int high = m-1;
        while (low<=high) {
            int mid= (low+high)/2;
            if(mat[mid]==target) return true;
            else if(mat[mid]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
