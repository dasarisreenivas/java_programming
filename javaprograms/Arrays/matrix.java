package Arrays;
import java.util.*;
class matrix{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("number of rows:");
        int m=sc.nextInt();
        System.out.println("number of columns");
        int n = sc.nextInt();
        int mat[][]= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }   
}
}