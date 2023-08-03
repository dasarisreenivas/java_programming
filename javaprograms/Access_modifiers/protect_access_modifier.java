package Access_modifiers;
import java.util.*;
public class protect_access_modifier{
    Scanner sc = new Scanner(System.in);
    protected int a = sc.nextInt();
    protected protect_access_modifier(){
        a = 10;
    }
   protected  void printing(){
        System.out.println("the number is"+a);
    }
}