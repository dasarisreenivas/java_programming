package bin_programms;
import java.util.*;
public class Solution implements problem{
    @Override
    public void add(){
        try(Scanner sc = new Scanner(System.in)){
            var num1=sc.nextLong();
            var num2=sc.nextLong();
            var num3=num1+num2;
            System.out.println("the add of two numbers is "+num3);
        }
    }
    @Override
    public void sub(){
        try(Scanner sc = new Scanner(System.in)){
            var num1=sc.nextLong();
            var num2=sc.nextLong();
            var num3=num1-num2;
            System.out.println("the sub of two numbers is "+num3);
        }
    } 
     @Override
    public void div(){
        try(Scanner sc = new Scanner(System.in)){
            var num1=sc.nextLong();
            var num2=sc.nextLong();
            var num3=num1/num2;
            System.out.println("the div of two numbers is "+num3);
        }catch(Exception e){
            System.out.println(" num2 should not be zero");
        }
    }
    @Override
    public void mul(){
        try(Scanner sc = new Scanner(System.in)){
            var num1=sc.nextLong();
            var num2=sc.nextLong();
            var num3=num1*num2;
            System.out.println("the mul of two numbers is "+num3);
        }
    } 
}