package Arrays;
import java.util.*;
public class intersection_of_two_sorted_arrays_optimal_approach {
    public static void main(String[]args){
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        int arr1[]={1,2,3,3,4,5,6,7};
        int arr2[]={2,3,3,4,5,6};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i =0;
        int j =0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]) i++;
            else if(arr2[j]<arr1[i]) j++;
            else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        System.out.print(intersection);
    }
}
/* time complexity = O(n1+n2)
 * space complexiity = O(1)
 */
