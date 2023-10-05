package Arrays;
public class Longest_Subarray_with_given_Sum_K_positive_brute_force1 {
    public static void main(String[]args){
        int arr[] = {2, 3, 5, 1, 9};
        int len = 0;
        int m=4;
        int sum;
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j=i;j<n;j++){
                sum=0;
                for(int k =i;k<=j;k++){
                    sum=sum+arr[i];
                }
                if(sum==m ) len=Math.max(len,j-i+1);
            }
        }
        System.out.println(len);
    }
}
