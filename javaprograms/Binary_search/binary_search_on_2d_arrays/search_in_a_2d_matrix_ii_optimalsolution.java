package Binary_search.binary_search_on_2d_arrays;
public class search_in_a_2d_matrix_ii_optimalsolution {
    public static void main(String[] args) {
        int [][]matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int n = matrix.length;
        int m = matrix[0].length;
        int target = 15;
        System.out.println(searchingForElement1(matrix, n, m, target));
        //alternate method by reversing the row and column
        int[] res  = searchingForElement2(matrix, n, m, target);
        for(int it:res){
            System.out.println(it);
        }
    }
    public static boolean searchingForElement1(int[][]matrix,int n,int m,int target){
        int row = 0;
        int column = m-1;
        while(row<n && column>=0){
            if(matrix[row][column]==target) return true;
            else if(matrix[row][column]<target) row++;
            else column--;
        }
        return false;
    }
    public static int[] searchingForElement2(int[][]matrix,int n,int m,int target){
        int row = n-1;
        int column =0;
        while(row>=0 && column<=m-1){
            if(matrix[row][column]==target) return new int[]{row,column};
            else if(matrix[row][column]>target) row--;
            else column++;
        }
        return new int[]{-1,-1};
    }
}
/*time complexity  =  O(n+m); 
 * space complexity = O(1);
*/
