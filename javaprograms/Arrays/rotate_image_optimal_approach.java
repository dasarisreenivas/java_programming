package Arrays;
public class rotate_image_optimal_approach {
    public static void main(String[]args){
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,15}};
        transpose(mat);
        reverse(mat);
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void transpose(int mat[][]){
        for(int i =0;i<mat.length;i++){
          for(int j =i;j<mat.length;j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    public static void reverse(int[][]mat){
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat.length/2;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[i][mat.length-1-j];
                mat[i][mat.length-1-j]=temp;
            }
        }
    }
}
