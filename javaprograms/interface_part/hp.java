  package interface_part;
public class hp implements Laptop{
    @Override
    public void copy() {
       System.out.println("this is hp copy code");
    }

    @Override
    public void paste() {
        System.out.println("this is hp paste code");
    }

    @Override
    public void keyboard() {
       System.out.println("this is hp key board code");
    }

    @Override
    public void cut() {
       System.out.println("this is hp cut code");
    }
    public void camera(){
        System.out.println("this is a hp camera");
    }

}