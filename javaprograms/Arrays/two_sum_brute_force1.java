package Arrays;
public class two_sum_brute_force1 {
    public static void main(String[] args) {
        
        int[]arr = {2,7,11,15};
        int target = 9;
        int ans [] = new int [2];
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        for(int i = 0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
}
}
