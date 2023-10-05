package Arrays;
public class single_number_in_array_and_remaining_are_twice_optimal {
    public static void main(String[]args){
        int arr[]={1,1,2,3,3,4,4,5,5};
        int xor = 0;
        for(int i = 0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}
