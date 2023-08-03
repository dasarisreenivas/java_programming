package Access_modifiers;
import java.util.*;
interface Student1{
    void studentdetails();
}
interface Student2{
    void studentdetails1();
}
interface principal extends Student1,Student2{
   void checkingdetails();
}
 class ACCESS_MODIFIERS implements principal{
    @Override
    public void studentdetails(){
      try( Scanner sc = new Scanner(System.in)){
            String name = sc.nextLine();            
            String rollno=sc.nextLine();
            long phone=sc.nextLong();
            System.out.println("name of the student "+name);
            System.out.println("roll number of the student "+rollno);
            System.out.println("phone number of the student "+phone);
        }catch(Exception b){
            System.out.println(b);
        }
    }
    @Override
        public void studentdetails1(){
                try(Scanner sv = new Scanner(System.in)){
                String name=sv.nextLine();
                String rollno=sv.nextLine();
                long phone=sv.nextLong();
                System.out.println("name of the student "+name);
                System.out.println("roll number of the student "+rollno);
                System.out.println("phone number of the student "+phone);
                }catch(Exception e){
                    System.out.println("this is an exception");
                }
        }
        @Override
        public void checkingdetails(){
           try{
            studentdetails();
            studentdetails1();
           }catch(Exception e){
            System.out.println(e+"e");
           }
        }
    public static void main(String[]args){
        ACCESS_MODIFIERS i =new ACCESS_MODIFIERS();
        i.checkingdetails();


    }
}