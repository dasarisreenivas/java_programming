package Arrays;
import java.util.*;
class multiplication_of_two_matrices{
    public static void main(String[] args) {
       try(Scanner ds = new Scanner(System.in)){
        System.out.println("enter the number of rows");
        int m=ds.nextInt();
        System.out.println("enter the number of columns");
        int n=ds.nextInt();
        int mat1[][]=new int[m][n];
        int mat2[][]=new int[m][n];
        int mat3[][]=new int[2][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=ds.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat1[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat2[i][j]=ds.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat2[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                mat3[i][j]=0;
                for(int k=0;k<m;k++){
                    mat3[i][j]=mat3[i][j]+(mat1[i][k]*mat2[k][j]);
                }
            }
        }
System.out.println("the resultant matrix is:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(mat3[i][j]);
            }
            System.out.println();
        }
    }catch(Exception e){
        System.out.println(e);
        e.printStackTrace();
    }
}
}