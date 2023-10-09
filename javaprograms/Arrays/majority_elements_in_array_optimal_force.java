package Arrays;
public class majority_elements_in_array_optimal_force {
    public static void main(String[]srgs){
        int arr[] = {1,2,3,1,5,2,3,5,5,5,5,5,5};
        int n = arr.length;
        System.out.println(moores_algo(arr, n));
    }
    public static int moores_algo(int []arr,int n){
        int cont = 0;
        int element=0;
        for(int i=0;i<n;i++){
            if(cont==0){
                cont=1;
                element=arr[i];
            }else if(arr[i]==cont){
                cont++;
            }else{
                cont--;
            }
        }
        return element;
       /*  int cont2 = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==element){
                cont2++;
            }                             // this block is used for the verifying and return the value
            if(cont2>n/2){
                return element;
            }
        }*/
    }
}
