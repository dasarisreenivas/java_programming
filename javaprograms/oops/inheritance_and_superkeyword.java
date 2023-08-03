package oops;
import java.util.*;
class guest_user{
    Scanner sc = new Scanner(System.in);
    int a =1;
    int b =0;
}
class Developers extends guest_user{
    public void write(){
        for(int i=0;i<4;i++){
            if(i==0){
                System.out.println("the sum od two numbers"+(a+b));
            }else if(i==1){
                System.out.println("the difference of two number is"+(a-b));
            }else if(i==2){
                System.out.println("the multiplication of two numbers is"+(a*b));
            }else if(i==3){
                System.out.println("the difference of two numbers is"+(a/b));
            }
        }
    }
}
class admins extends Developers{
    public void manage(){
        if(b!=0){
        super.write();
        System.out.println("your inputs are invalid");
    }
}
    public void write(){
        int c =1;
        System.out.println("admins method");
         for(int i=0;i<4;i++){
            if(i==0){
                System.out.println("the sum od two numbers"+(a+c));
            }else if(i==1){
                System.out.println("the difference of two number is"+(a-c));
            }else if(i==2){
                System.out.println("the multiplication of two numbers is"+(a*c));
            }else if(i==3){
                System.out.println("the difference of two numbers is"+(a/c));
            }
        }
    }
    }

class inheritance_and_superkeyword{
    public static void main(String[]args){
        admins a =new admins();
        a.write();
        a.manage();
        }
}