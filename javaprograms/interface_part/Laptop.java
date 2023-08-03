package interface_part;
public interface Laptop{
    public void copy();
    public void paste();
    public void cut();
    public void keyboard();
    default void security(){
        System.out.println("please implement the code");
        commoncode();
    }
    static void audio(){
        System.out.println("this is the laptop code");
    }
    private  void commoncode(){
        System.out.println("commomcode");
    }
}