package collections_in_java;
import java.util.*;
public class barray_list {
    public static void main(String[] args) {
    ArrayList a1 = new ArrayList();
    for(int i=0;i<=10;i++){
        a1.add(i);
    }
    System.out.println(a1);
    Object [] array = a1.toArray();
    //adding the elements 
    for(int i =0;i<a1.size();i++){
        array[i]=a1.get(i);
    }
   /*  for(int i =0;i<=a1.size();i++){
        System.out.println(array[i]);
    }*/
    //adding the elements
    ArrayList a2 = new ArrayList<>();
    a2.add(a1);
    System.out.println(a2);
    a2.addAll(a1);
    System.out.println(a1);
    a2.add(a1.add(2));
    //getting the elements
    System.out.println(a2.get(2));
    //capacity method is not allowed in the arraylist
    //System.out.println(a2.capacity());
    
}
}
