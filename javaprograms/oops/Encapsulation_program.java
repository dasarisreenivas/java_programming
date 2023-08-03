package oops;

import java.util.*;
class Human{
private int age;
private String name;
public int getAge(){
    return age;
}
public void setAge(int a){ 
    age=a;
}
public String getName(){
    return name;
}
public void setName(String b){
    name=b;
}
}
public class Encapsulation_program{
    public static void main(String[]args){
        
        try(Scanner sc= new Scanner(System.in)){
        do{
        Human obj = new Human();
        int c  = sc.nextInt();
        String Name = sc.next();
        obj.setAge(c);
        obj.setName(Name);
        if(obj.getName().equals("p")){
            System.out.println(obj.getAge()+" is present");
        }else{
            System.out.println(obj.getAge()+" is absent");
        }
    }while(true);
}
}
}