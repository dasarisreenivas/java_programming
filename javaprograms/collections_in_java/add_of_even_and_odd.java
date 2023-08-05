package collections_in_java;
import java.util.*;
public class add_of_even_and_odd{
    public static void main(String[] args) {
        ArrayList numbers= new ArrayList<>();
        for(int i=0;i<=10;i++){
            numbers.add(i);
        }
        System.out.println(numbers);
        ArrayList evennumbers = new ArrayList<>();
        ArrayList oddnumbers = new ArrayList<>();
        int s=0;
        for(int i=0;i<numbers.size();i++){
            int num = (int) numbers.get(i);
            if(num%2==0){
                evennumbers.add(num);
            }else{
                oddnumbers.add(num);
            }
        }
        System.out.println(evennumbers);
        System.out.println(oddnumbers);
    }
}