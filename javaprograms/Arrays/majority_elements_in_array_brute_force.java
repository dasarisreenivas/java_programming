package Arrays;
public class majority_elements_in_array_brute_force {
    public static void main(String[]args){
        int arr[] = {1,2,3,1,5,2,3,5,5,5,5,5,5};
        for(int i = 0;i<arr.length;i++){
            int cnt =  0;
            for(int j = 0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
                if(cnt>(arr.length)/2){
                    System.out.print (arr[i]);
                    return ;
                }
            }
        }
        System.out.println(-1);
    }
}
