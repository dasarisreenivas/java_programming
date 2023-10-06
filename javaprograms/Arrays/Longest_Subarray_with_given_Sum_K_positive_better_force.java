package Arrays;
import java.util.*;
public class Longest_Subarray_with_given_Sum_K_positive_better_force {
    public static void main(String[]args){
        int arr[] ={1,1,1,2,1,3,1,4,4,5};
        int n = arr.length;
        int k = 4;
        System.out.print(subarray1(arr,n,k));
    }
    public static int subarray1(int arr[],int n,int k){
        Map<Long ,Integer> presum = new HashMap<Long,Integer>();
        Long sum =(long) 0;
        int max_len=0;
        for(int i =0;i<n;i++){
            sum +=arr[i];
            if(sum==k) max_len=Math.max(max_len,i+1);
            Long rem = sum-k;
            if(presum.containsKey(rem)){
                int len = i-presum.get(rem);
                max_len=Math.max(max_len, len);
            }
            if(!presum.containsKey(sum)){
                presum.put(sum,i);
            }
        }

        return max_len;
    }
}
