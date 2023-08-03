package methods;
import java.util.*;
class Computer{
    public void getdata(){
        System.out.println("hey this is the methods in java");
    }
    public String getdata1(int cost){
        if(cost>=10){
            return "pen";
        }else{
            return "you don't get any pen";
        }
    }
}
class Methods{
    public static void main(String[] args) {
        try(Scanner ds = new Scanner(System.in)){
        int a = ds.nextInt();
        Computer sc = new Computer();
        sc.getdata();
        String str = sc.getdata1(a);
        System.out.println(str);
        }
}
}

