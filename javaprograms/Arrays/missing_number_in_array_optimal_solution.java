package Arrays;

public class missing_number_in_array_optimal_solution  {
    public static void main(String[]args){
        int arr []= {1,2,4,5};
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        int sum2=0;
        for(int i =0;i<arr.length;i++){
            sum2+=arr[i];
        }
        System.out.println(sum-sum2);
    }
}
/*
 * time complexity = O(n)
 * space complexity = O(1)
 */