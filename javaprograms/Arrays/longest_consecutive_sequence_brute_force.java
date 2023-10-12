package Arrays;
public class longest_consecutive_sequence_brute_force {
    public static void main(String[]args){
        int arr[] = {102,4,100,1,101,3,2,1,1};
        int longest =1;
        for(int i =0;i<arr.length;i++){
            int count =1;
            int x = arr[i];
            while(linearsearch(arr,x+1)){
                count++;
                x=x+1;
            }
            longest=Math.max(longest,count);
        }
        System.out.println(longest);
    }
    public static boolean linearsearch(int arr[],int n){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==n) return true;
        }
        return false;
    }
}
