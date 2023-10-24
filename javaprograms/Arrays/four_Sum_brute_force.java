package Arrays;
import java.util.*;
public class four_Sum_brute_force {
    public static void main(String[]args){
        int nums[]={-1,0,1,2,-3,-4};
        int n= nums.length;
        int target = 0;
        List<List<Integer>> result = sum(n,nums,target);
        for(List<Integer> it : result){
            System.out.print("[ ");
                for(Integer i : it){
                    System.out.print(i+" ");
                }
            System.out.print(" ]");
        }
        System.out.println();
    }
    public static List<List<Integer>> sum(int n,int []nums,int target){
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    for(int l= k+1;l<n;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            st.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
