package Arrays;
import java.util.*;
public class two_sum_optimal_approach {
    public static void main(String[] args) {
        int[]arr = {2,7,11,15};
        int target = 9;
        int []result = res(arr,target);
        System.out.print(result[0]+" "+result[1]);
    }
    public static int[] res(int []arr,int target){
          Map<Integer,Integer> hash = new HashMap<>();
          int ans[] = new int[2];
          for(int i = 0;i<arr.length;i++){
            int num=arr[i];
            int need_sum = target-num;
            if(hash.containsKey(need_sum)){
                ans[0]=hash.get(need_sum);
                ans[1]=i;
                return ans;
            }
            hash.put(arr[i],i);
          }
          return ans;
    }
}
