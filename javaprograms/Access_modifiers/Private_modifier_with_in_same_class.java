package Access_modifiers;
//import java.util.*;
public class Private_modifier_with_in_same_class{
    private int rollnumber=10;
    public Private_modifier_with_in_same_class(){
        rollnumber =11;
    }
    private void printrollnumber(){
        System.out.println(rollnumber);
    }
    public static void main(String[] args) {
        Private_modifier_with_in_same_class s = new Private_modifier_with_in_same_class();
        System.out.println(s.rollnumber);
        s.printrollnumber();
    }
}
//to see wheater the private access_modifer is accessed in bin class 
//or not,go to access_modifier