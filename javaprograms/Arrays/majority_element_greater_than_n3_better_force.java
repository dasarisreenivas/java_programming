package Arrays;
import java.util.*;
public class majority_element_greater_than_n3_better_force {
    public static void main(String[]args){
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int arr[] = {1,1,1,1,3,2,2,2};
        int n = arr.length;
        int min = (n/3)+1;
        for(int i = 0;i<n;i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
            if(map.get(arr[i])==min) list.add(arr[i]);
            if(list.size()==2) break ;
        }
        System.out.println(list);
    }
}
