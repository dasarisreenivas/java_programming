package Arrays;
import java.util.*;
public class sort_0_1_2_better_approach {
    public static void main(String[]args){
        ArrayList<Integer> arr= new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(sort(arr,n));
        sc.close();
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> arr, int n){
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i = 0;i<n;i++){
        if(arr.get(i)==0){
            count0++;
        }else if(arr.get(i)==1){
            count1++;
        }else{
            count2++;
        }                                                  //time complexity = O(N+N)
        }                                                  //space complexity = O(1)
        for(int i = 0;i<count0;i++){
            arr.set(i,0);
        }
        for(int i=count0;i<count0+count1;i++){
            arr.set(i,1);
        }
        for(int i=count0+count1;i<count0+count1+count2;i++){
            arr.set(i,2);
        }
        return arr;
    }
}
