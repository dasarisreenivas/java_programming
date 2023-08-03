package basic_programms;
import java.util.*;
public class Armstrong_number{
       
    public static int getNumber(int number){
    int count=0;
    while(number!=0){
    number=number/10;
    count++;
    }
    return count;
    
}
    public static void main(String[]args){
    try(Scanner sc = new Scanner(System.in)){
    int n = sc.nextInt();
    int temp=n;
    int rem;
    int digits=getNumber(n);
    int p=0;
    while(n>0){
        rem=n%10;
        p=(int) (p+Math.pow(rem,digits));
        n=n/10;
    }
    if(temp==p){
        System.out.println(temp+" is a arm stron number");
    }else{
        System.out.println(temp+" is not a arm strong number");
    }
}
}
}