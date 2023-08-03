package type_inference;
//iport java.util.*;
class type_inference_in_arrays{
    public static void main(String[] args) {
        int arr[]=new int [1];
        System.out.println(arr[0]=1);//this ia normal array
        var arrr=new int[2];
        System.out.println(arrr[1]=10);
        var arrrr=new int[]{1,2,3};
        System.out.println(arrrr[0]);
        System.out.println(arrrr[1]);
        System.out.println(arrrr[2]);
    }
}