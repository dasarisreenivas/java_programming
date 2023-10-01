package Arrays;
import java.util.*;
public class move_zeros_to_last_brute_force {
    public static void main(String[] args) {
        int arr[] = {1,2,0,3,0,5,1,0,4,0};
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
        for(int i =0;i<temp.size();i++){
            arr[i]=temp.get(i);
        }
        for(int i = temp.size();i<n;i++){
            arr[i]=0;
        }
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
