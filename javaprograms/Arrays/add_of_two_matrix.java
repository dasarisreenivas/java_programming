package Arrays;
import java.util.*;
class add_of_two_matrix{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("enter the number of rows:");
            int m=sc.nextInt();
            System.out.println("enter the number of columns:");
            int n= sc.nextInt();
            int mat1[][]=new int[m][n];
            int mat2[][]=new int[m][n];
            int mat3[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    mat1[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(mat1[i][j]+" ");
                }
                System.out.println();
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    mat2[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(mat2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("**************add of two matrix**************");
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    mat3[i][j]=mat1[i][j]+mat2[i][j];
                    System.out.print(mat3[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
