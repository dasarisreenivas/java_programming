package Arrays;
public class missing_number_in_array_optimal_solution2 {
    public static void main(String[]args){
        int arr[]= {1,2,4,5};
        int n = arr.length;
        int actual_xor=0;
        int arr_xor=0;
        for(int i =0;i<n-1;i++){
            actual_xor^=(i+1);
            arr_xor^=arr[i];
        }
        actual_xor^=n;
        System.out.println(actual_xor^arr_xor);
    }
}
