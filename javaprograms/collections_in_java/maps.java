package collections_in_java;
import java.util.*;
import java.util.Map.Entry;
class maps{
    public static void main (String[] args) {
        HashMap<Integer,String> list = new HashMap<Integer,String>();
        list.putIfAbsent(1,"mbu");
        list.putIfAbsent(2,"svec");
        list.putIfAbsent(3,"svne");
        list.putIfAbsent(4,"svu");
        System.out.println(list);
        System.out.println(list.size());
        Set<Integer> keys =list.keySet();
        Collection<String> val=list.values();
        for(String value:val){
            System.out.println(value);
        }
        for(Integer key:keys){
            System.out.println(key);
        }
        //retriving the both keys and vaues at sametime
         for(Integer key:keys){
            System.out.println(key+">>>>>"+list.get(key));
        }
        //another way retriving the key values at same time 
        Set<Entry<Integer,String>> keys_and_values = list.entrySet();
        for(Entry<Integer,String> h : keys_and_values){
            System.out.println(h);
        }
        //another way retriving thr keys and values at the same time 
         for(Entry<Integer,String> h : keys_and_values){
             Integer k = h.getKey();
             String v =h.getValue();
             System.out.println(k+">>>>>"+v);
        }
        //to check wheather the keys and value is present int map or another
        System.out.println(list.containsKey(1));
        System.out.println(list.containsValue("mbu"));
        //Deleting the element from the list
        list.remove(1);//deleting the element using the key
        System.out.println(list);
        //deleting the element using both key and value
        list.remove(2,"svec");
        System.out.println(list);
        //updating the elemnt using the putIfAbsent() 
        list.putIfAbsent(1,"mbu");
        list.putIfAbsent(4,"jntu");
        System.out.println(list);
        //clearing the map
        list.clear();
        System.out.println(list);
    }
}
