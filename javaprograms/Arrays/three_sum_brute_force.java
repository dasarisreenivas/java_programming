package Arrays;
import java.util.*;
public class three_sum_brute_force {
    public static void main(String[] args) {
        int []nums={-1,0,1,2,-1,-4};
        int n = nums.length;
        List<List<Integer>> result = triplet(n,nums);
        System.out.print("[ ");
        for(List<Integer> it : result){
            System.out.print("[ ");
            for(Integer i:it){
                System.out.print(i+" ");
            }
            System.out.print("]");
        }
        System.out.println(" ]");
    }
    public static List<List<Integer>> triplet(int n,int[]nums){
        Set<List<Integer>> st = new HashSet<>();
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
