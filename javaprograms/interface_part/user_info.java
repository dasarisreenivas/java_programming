package interface_part;
import java.util.*;
class user_info{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
        String laptop=sc.next();
        
        if(laptop.equals("lenovo")){
        Lenovo l = new Lenovo();
        l.copy(); 
        l.cut();
        l.paste();
        l.keyboard();
        l.security();
        Laptop.audio();
        }else{
        hp h = new hp();
        h.copy();
        h.cut();
        h.paste();
        h.keyboard();
        }
    }
}
}