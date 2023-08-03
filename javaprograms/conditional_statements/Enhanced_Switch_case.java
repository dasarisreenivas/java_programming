package conditional_statements;
import java.util.*;
class Enhanced_Switch_case{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
         switch (age){
            case 18 -> { System.out.println("you are  eligible to vote");
                        System.out.println("you are not eligible to vote");
         }
         case 19 -> System.out.println("you ara not eligible to vote");
         default -> System.out.println("thank you");
        }sc.close();
    }
}