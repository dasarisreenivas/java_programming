package Arrays;
public class rotate_image_brute_force {
    public static void main(String[]args){
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int result[][] = new int[mat.length][mat.length];
        for(int i = 0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                result[j][mat.length-1-i]=mat[i][j];
            }
        }
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat.length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
