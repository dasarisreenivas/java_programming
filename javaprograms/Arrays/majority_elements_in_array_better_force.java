package Arrays;
import java.util.*;
public class majority_elements_in_array_better_force {
    public static void main(String[]args){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int arr[] ={1,2,3,1,5,2,3,5,5,5,5,5,5};
        for(int i = 0;i<arr.length;i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue()>arr.length/2){
                System.out.println(it.getKey());
                return ;
            }
        }
        System.out.println(-1);
    }
}
