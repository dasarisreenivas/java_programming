package Arrays;
import java.util.*;
public class majority_element_greater_than_n3_brute_force {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<Integer>();
        int arr[]={1,1,1,1,3,2,2,2};
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(list.size()==0 || list.get(0)!=arr[i]){
                int count = 0;
                for(int j =0;j<n;j++){
                    if(arr[j]==arr[i]) count++;
                }
                if(count>n/3) list.add(arr[i]);
            }
            if(list.size()==2) break ;
        }
        System.out.println(list);
    }
}
