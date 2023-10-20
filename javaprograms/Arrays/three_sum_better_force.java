package Arrays;
import java.util.*;
public class three_sum_better_force {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4,-1,0,0,0};
        int n = nums.length;
        List<List<Integer>> ans = triplet(n,nums);
        for(List<Integer> it : ans){
            System.out.print("[ ");
            for(Integer i : it){
                System.out.print(i+" ");
            }
            System.out.print("]");
        }
        System.out.println();
    }
    public static List<List<Integer>> triplet(int n ,int[]nums){
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<n;i++){
            Set<Integer> st1 = new HashSet<>();
            for(int j =i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);
                if(st1.contains(third)){
                    List<Integer> temp  = Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                st1.add(nums[j]);
            }
        }
        List<List<Integer>> result = new ArrayList<>(st);
        return result;
    }
}
