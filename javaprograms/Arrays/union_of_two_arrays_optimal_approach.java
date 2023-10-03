package Arrays;
import java.util.*;
public class union_of_two_arrays_optimal_approach {
    public static void main(String[]ars){
        ArrayList<Integer> union = new ArrayList<Integer>();
        int a [] ={1,1,2,3,4,5};
        int b [] ={2,3,4,5,6};
        int n1 = a.length;
        int n2 = b.length;
        int i =0;
        int j =0;
        while(i<n1 && j<n2){
            if(a[i]<b[j]){
                if(union.size() == 0 || union.get(union.size()-1)!=a[i]){
                    union.add(a[i]);
                }
                i++;
            }else{
                if(union.size() == 0 || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while(i<n1){
            if(union.size() == 0 || union.get(union.size()-1)!=a[i]){
                union.add(a[i]);
            }
            i++;
        }
        while (j<n2){
             if(union.size() == 0 || union.get(union.size()-1)!=b[j]){
                    union.add(b[j]);
                }
                j++;
        }
        System.out.print(union);

    }
}