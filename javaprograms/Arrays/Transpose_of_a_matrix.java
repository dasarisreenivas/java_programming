package Arrays;
import java.util.Scanner;
class Transpose_of_a_matrix{
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int matrix[][]=new int[a][b];
        int transpose[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("transpose of a matrix is :");
       for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            transpose[i][j]= matrix[j][i];
            System.out.print(transpose[i][j]+" ");
        }
        System.out.println();
       }
    }
}
}