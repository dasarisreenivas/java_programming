package conditional_statements;
import java.util.*;
class Vote_Eligibility{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age>=18){
        System.out.print("you are eligiblto vote ");
        System.out.println("because yours age is "+age);
        
    }else{
        System.out.print("you are not eligible to vote");
        System.out.println("because yours age is "+age);
    }
    sc.close();
    }
}