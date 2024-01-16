package Binary_search.binary_search_on_2d_arrays;

public class find_the_peak_element_in_2d_matrix_optimalsolutiton {
    public static void main(String[] args) {
        int [][]matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int n = matrix.length;
        int m = matrix[0].length;
        int target = 15;
        int[]result = peakElement(matrix, n, m, target);
        for(int it:result){
            System.out.println(it);
        }
    }
    public static int[] peakElement(int[][]matrix,int n,int m,int target){
        int low = 0;
        int high = m-1;
        while (low<=high) {
            int mid =(low+high)/2;
            int row  = maxElement(matrix,n,m,mid);
            int left =(mid-1>=0)?matrix[row][mid-1]:-1;
            int right = (mid+1<0)?matrix[row][mid+1]:-1;
            if(matrix[row][mid]>left && matrix[row][mid]>right){
                return new int[]{row,mid};
            }else if(matrix[row][mid]<left) high=mid-1;
            else low = mid+1;
        }
        return new int[]{-1,-1};
    }
    public static int maxElement(int[][]matrix,int n,int m,int col){
        int maxelement = -1;
        int index = -1;
        for(int i = 0;i<n;i++){
            if(matrix[i][col]>maxelement){
                maxelement =matrix[i][col];
                index = i;
            }
        }
        return index;
    }
}
