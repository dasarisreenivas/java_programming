package Arrays;
public class Longest_Subarray_with_given_Sum_K_positive_brute_force2 {
    public static void main(String[]args){
        int arr[] = {1,1,2,1,3,4,1,1,};
        int len=0;
        int k =3;
        int n = arr.length;
        for(int i =0;i<n;i++){
            int sum=0;
            for(int j =i;j<n;j++){
                sum=sum+arr[j];
                if(sum==k) len = Math.max(len,j-i+1);
            }
        }
        System.out.println(len);
    }
}
