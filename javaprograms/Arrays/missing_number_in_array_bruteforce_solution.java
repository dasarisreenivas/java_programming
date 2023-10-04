package Arrays;

public class missing_number_in_array_bruteforce_solution {
    public static void main(String[]args){
        int arr[] = {1,2,4,5};
        int flag ;
        int n = arr.length;
        for(int i =1;i<=arr.length;i++){
            flag = 0;
            for(int j =0;j<arr.length;j++){
                if(arr[j]==i){
                    flag = 1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(i);
                return ;
            }
        }
    }
}
/*
 * time complexity = O(n*n)
 * space complexity = O(n)
 */
