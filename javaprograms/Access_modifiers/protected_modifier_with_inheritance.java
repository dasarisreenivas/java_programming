package Access_modifiers;

public class protected_modifier_with_inheritance extends protect_access_modifier{
    public   int rollno=10;
    public int a;
    public  protected_modifier_with_inheritance(){
        rollno=14;
    } 
 protected void printrollno(){
        System.out.println(rollno+1);
    }
    public void print(){
        System.out.println("this is a print method");
        printrollno();
    }
    public static void main(String[]args){
        protected_modifier_with_inheritance s = new protected_modifier_with_inheritance();
        s.printing();
        System.out.println(s.a);

    }
}