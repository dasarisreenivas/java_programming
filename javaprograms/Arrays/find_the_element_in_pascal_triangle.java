package Arrays;
public class find_the_element_in_pascal_triangle {
    public static void main(String[]args){
        int row = 5;
        int column=3;
        int resultant = 1;
        int r = row-1;
        int c=column-1; 
        for(int i = 0;i<c;i++){
            resultant = resultant*(r-i);
            resultant = resultant/(i+1);
        }
        System.out.println(resultant);
    }
}
