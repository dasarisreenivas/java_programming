package basic_programms;
import java.util.*;
class spiral_matrix{
    
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){;
        int r=0,c=0,row=3,column=3,counter=0;
        int arr[][] =new int[4][4];
        System.out.println("enter the matrix elements");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]=sc.nextInt());
            }
            System.out.println();
        }
       for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(""+arr[i][j]+"    ");
            }
            System.out.println();
        }
        System.out.println("***************************************************************************");
        while(counter<=16){ 
        for(int i=c;i<=column;i++){
            System.out.print(+arr[r][i]+"   ");
        }
       // System.out.println();
        r=r+1;
        counter++;
        for(int i=r;i<=row;i++){
            System.out.print(arr[i][column]+"   ");
        }
        //System.out.print();
        column=column-1;
        counter++;
        for(int i = column;i>=c;i--){
            System.out.print(arr[row][i]+"   ");
        }
        row=row-1;
        counter++;
        for(int i=row;i>=r;i--){
            System.out.print(arr[i][c]+"   ");
        }
        c=c+1;
        counter++;
        
    }
}
}
}
