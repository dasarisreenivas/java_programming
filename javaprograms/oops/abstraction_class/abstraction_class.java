package oops.abstraction_class;
public abstract class abstraction_class implements abstraction_interface{
    public void copy(){
        System.out.println("this is system copy method");
    }
    public void cut(){
        System.out.println("this is sysyem cut method");
    }
    public abstract void keyboard();
    public abstract void paste();
}