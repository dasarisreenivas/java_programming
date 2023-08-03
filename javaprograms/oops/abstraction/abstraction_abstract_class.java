package oops.abstraction;
public abstract class abstraction_abstract_class implements abstraction_interface{
    public void run(){
        System.out.println("run method");
    }
    public void paste(){
        System.out.println("paste method");
    }
    public abstract void keyboard();
    public abstract void  copy();
}