package Arrays;

 public class missing_number_in_array_better_solution {
    public static void main(String[]args){
        int arr[] = {1,2,4,5};
        int n = arr.length;
        int j =0;
        int hash [] = new int[arr.length+2];
        for(int i =0;i<n;i++){
            hash[arr[i]]=1;
        }
        for(int i = 1;i<hash.length;i++){
            if(hash[i]==0){
                j = i;
            }
        }
        System.out.println(j);
    }
}
/*time complexity = O(n)+O(n)
 * space complexity = O(n)
 */
