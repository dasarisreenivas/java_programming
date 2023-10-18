package Arrays;
import java.util.*;
public class majority_element_greater_than_n3_optimal_approach {
    public static void main(String[]args){
        int arr[] = {1,1,1,1,3,2,2,2};
        int n = arr.length;
        int count1=0;
        int count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(count1==0 && ele2!=arr[i]){
                count1++;
                ele1=arr[i];
            }else if(count2==0 && ele1!=arr[i]){
                count2++;
                ele2=arr[i];
            }else if(ele1==arr[i]) count1++;
            else if(ele2==arr[i]) count2++;
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i = 0;i<n;i++){
            if(ele1==arr[i]) count1++;
            if(ele2==arr[i]) count2++;
        }
        int min = (int)(n/3)+1;
        List<Integer> list = new ArrayList<>();
        if(count1>=min) list.add(ele1);
        if(count2>=min) list.add(ele2);
        System.out.println(list);
    }
}