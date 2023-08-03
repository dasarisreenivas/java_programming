package oops;
interface Iguest{
     void read();
}
interface Ideveloper{
     void write();
}
interface Iadmin extends Iguest, Ideveloper{
     void manage();
}
class Inheritance_with_interfaces implements Iadmin{
    
        @Override
        public void read(){
            System.out.println("this is the guest code");
        }
        @Override
        public  void write(){
            System.out.println("this id the developer code");
        }
        @Override
        public  void manage(){
            System.out.println("this is the admin code");
            }
    
    public static void main(String[]args){
        Inheritance_with_interfaces i = new Inheritance_with_interfaces();
        i.read();
        i.write();
        i.manage();
    }
}