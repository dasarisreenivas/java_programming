package Arrays;
public class single_number_in_array_and_remaining_are_twice_better_solution {
    public static void main(String[]args){
        int arr[]  = {1,1,2,3,3};
        int n = arr.length;
        //to find the maximum element of an array
        int maxi =0;
        for(int i =0;i<n;i++){
            maxi = Math.max(maxi,arr[i]);
        }
        int hash [] = new int[maxi+1];
        for(int i =0;i<arr.length;i++){    
            hash[arr[i]]++;
        }
        for(int i = 0;i<hash.length;i++){
            if(hash[i]==1){
                System.out.print(i);
            }
        }
    }
}
/*
 * time complexity = O(n)+O(n)+O(based on input)
 * space complexity =O(maxi)
 */
