package Arrays;
import java.util.*;
public class next_permutation {
    public static void main(String[]args){
        int [] arr={5,4,3,2,1};
        nextPermutation(arr);
        List<Integer> result = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            result.add(arr[i]);
        }
        System.out.println(result);
    }
    public static void nextPermutation(int [] arr){
        int n = arr.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,n-1);
        }else{
            for(int i = n-1;i>=index;i--){
                if(arr[i]>arr[index]){
                    int temp = arr[index];
                    arr[index]=arr[i];
                    arr[i]=temp;
                    break;
                }
            }
            reverse(arr,index+1,n-1);
        }
    }
    private static void reverse(int arr[],int left,int right){
        while(left<right){
            int temp  = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}