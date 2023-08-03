package bin_programs;
interface Laptops{
    public void run();
    default void cut(){
        System.out.println("this is laptop cut code");
        commoncode();
        
    }
    static void copy(){
        System.out.println("this is a laptop copy code");

    }
    private  void commoncode(){
        System.out.println("this is a common code");
    }
}
class lenovo implements Laptops{
    public void run(){
        System.out.println("this a rum method of lenovo laptopo");
    }
    public void cut(){
        System.out.println("this is lenovo cut code");
        //commoncode();
    }
    public void copy(){
        
        System.out.println("this is a lenovo copy code");
    }
}
class binmain{
    public static void main (String[] args) {
        lenovo l = new lenovo();
        l.cut();
        Laptops.copy();
        l.run();
    }
}