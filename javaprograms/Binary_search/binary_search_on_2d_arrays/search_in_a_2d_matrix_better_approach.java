package Binary_search.binary_search_on_2d_arrays;
public class search_in_a_2d_matrix_better_approach {
    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},{5,6,7,8}};
        int target = 1;
        System.out.println(search(matrix, target));
    }
    public static boolean search(int[][]matrix,int target){
        int n= matrix.length;
        int m = matrix[0].length;
        for(int i = 0;i<n;i++){
            if(matrix[i][0]<=target && target<=matrix[i][m-1]){
                return Binary_search(matrix[i],target);
            }
        }
        return false;
    }
    public static boolean Binary_search(int []arr,int target){
        int low = 0;
        int high = arr.length-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if(arr[mid]==target) return true;
            else if(arr[mid]<target) low = mid+1;
            else high = mid-1;
        }
        return false;
    }
}
