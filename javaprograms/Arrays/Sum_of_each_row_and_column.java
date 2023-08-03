package Arrays;
import java.util.*;
class Sum_of_each_row_and_column{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int sum=0,m,n;
            m=sc.nextInt();
            n=sc.nextInt();
            int matrix[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }
            for(int i=0;i<m;i++){
                sum=0;
                for(int j=0;j<n;j++){
                    sum=sum+matrix[i][j];
                }
                System.out.println("sum of "+(i+1)+"row is "+sum);
            }
            for(int i=0;i<m;i++){
                sum=0;
                for(int j=0;j<n;j++){
                    sum=sum+matrix[j][i];
                }
                System.out.println("sum of "+(i+1)+" column is"+sum);
            }
        }
    }
}