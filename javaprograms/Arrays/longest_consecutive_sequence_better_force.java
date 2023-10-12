package Arrays;
import java.util.*;
public class longest_consecutive_sequence_better_force {
    public static void main(String[]args){
        int arr[]={1,2,3,3,4,101,102,5,103};
        int result = consecutive(arr);
        System.out.println(result);
    }
    public static int consecutive(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        int longest =1;
        int lastsmaller=Integer.MIN_VALUE;
        if(arr.length==0) return 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]-1==lastsmaller){
                count++;
                lastsmaller=arr[i];
            }else if(arr[i]==lastsmaller){

            }else if(arr[i]!=lastsmaller){
                count=1;
                lastsmaller=arr[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }

}
