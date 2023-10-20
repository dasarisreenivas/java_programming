package Arrays;
import java.util.*;
public class three_sum_optimal_solution {
    public static void main(String[]args){
        int arr[] = {-1,0,1,2,-1,-4,-1,0,0,0};
        int n = arr.length;
        List<List<Integer>> result = triplets(n, arr);
        for(List<Integer> it : result){
            System.out.print("[");
            for(Integer i : it){
                System.out.print(i+" ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
    public static List<List<Integer>> triplets(int n ,int []nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i =0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue ;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }
        }
        return ans;
    }
}
