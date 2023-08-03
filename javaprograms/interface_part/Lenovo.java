package interface_part;
public  class Lenovo implements Laptop{

    @Override
    public void copy() {
       System.out.println("this is lenovo copy code");
    }

    @Override
    public void paste() {
        System.out.println("this is lenovo paste code");
    }

    @Override
    public void keyboard() {
       System.out.println("this is lenovo key board code");
    }
    @Override
    public void cut() {
       System.out.println("this is lenovo cut code");
    }@Override
    public void security(){
      System.out.println("this is the lenovo security ");
    }
} 