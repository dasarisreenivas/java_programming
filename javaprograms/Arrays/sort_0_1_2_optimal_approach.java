package Arrays;
import java.util.*;
public class sort_0_1_2_optimal_approach {
    //brute fore is just sorting the array using the sorting techniques;
    public static void main(String[]args){
        Scanner sc =  new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.print(sort(arr,n));
        sc.close();
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> arr,int n){
        int low  =0;
        int mid = 0;
        int high=n-1;
        while(mid<=high){
            if(arr.get(mid)==0){                                                
                int temp = arr.get(mid);            
                arr.set(mid,arr.get(low));  
                arr.set(low,temp);
                low++;                                                       //time complexity = O(n);
                mid++;                                                       //space compkexity = O(1);
            }else if(arr.get(mid)==1){
                mid++;
            }else if(arr.get(mid)==2){
                int temp  = arr.get(mid);
                arr.set(mid,arr.get(high));
                arr.set(high,temp);
                high--;
            }
        }
        return arr;

    }
}
