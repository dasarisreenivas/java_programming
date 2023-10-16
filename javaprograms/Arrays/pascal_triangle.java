package Arrays;
import java.util.*;
public class pascal_triangle {
    public static void main(String[]args){
        int numberofrows=6;
        System.out.println(pascaltriangle(numberofrows));   
    }
    public static int ncr(int n ,int r){
        long res =1;
        for(int i = 0;i<r;i++){
            res=res*(n-i);
            res=res/(i+1);
        }
        return (int) res;
    }
    public static List<List<Integer>> pascaltriangle(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=n;row++){
            List<Integer> tempList = new ArrayList<>();
            for(int column = 1;column<=row;column++){
                tempList.add(ncr(row-1,column-1));
            }
            ans.add(tempList);
        }
        return ans;
    }
}
