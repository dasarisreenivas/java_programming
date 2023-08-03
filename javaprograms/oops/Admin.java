package oops;
class Admin extends Developer{
    public void manage(){
        super.read();
        write();
        System.out.println("manage data");
    }
    public void read(){
        System.out.println("admin code");
    }
} 