package Binary_search.bninary_search_on_Answers;
public class median_of_two_sorted_arrays_brutegorce {
    public static void main(String[] args) {
        int arr1[]={1, 4, 7, 10, 12};
        int arr2[]={2,3,6};
        System.out.println(median(arr1, arr2));
    }
    public static double median(int[]arr1,int[]arr2){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1+n2;
        int arr3[] = new int[n3];
        int i = 0;
        int j =0;
        int k=0;
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i++];
                k++;
            }else{
                arr3[k]=arr2[j++];
                k++;
            }
        }
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2){
            arr3[k++]=arr2[j++];
        }
        if(n3%2!=0) return (double)arr3[n3/2];
        else return ((double)(arr3[n3/2])+((double)arr3[(n3/2)-1]))/2.0;
    }
}

/*time complexity =  O(n1+n2) 
 * space complexity = O(n1+n2)
*/