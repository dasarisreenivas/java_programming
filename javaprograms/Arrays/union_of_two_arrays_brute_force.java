package Arrays;
//order of elements should be sorted;
import java.util.*;
public class union_of_two_arrays_brute_force {
    public static void main(String[]args){
        int arr1[] = {1,2,3,4,4,1,5};
        int arr2[] = {0,2,2,1,4,5,6};
        int n1 = arr1.length;
        int n2 = arr2.length;
        Set<Integer> st = new HashSet<Integer>();
        for(int i =0;i<n1;i++){
            st.add(arr1[i]);
        }
         for(int i =0;i<n2;i++){
            st.add(arr2[i]);
        }
        int union[] = new int[st.size()];
        int j =0;
        for(int it : st){
            union[j++]=it;
        }
        for(int i =0;i<union.length;i++){
            System.out.print(union[i]+" ");
        }
    }
}
