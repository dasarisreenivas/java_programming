package conditional_statements;
import java.util.*;
class Switch_case_examples{
    public static void railwayconfermation(String startingcharacter){
        switch(startingcharacter){
            case "A" ->{
                System.out.println("traiin will not stop at this station");
                System.out.println("you may leave in nextStation");
            }
            case "B" ->{
                System.out.println("train will stop at this station\n becuse it is a junction");
            }
        }
    }
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        railwayconfermation(a);
        sc.close();
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        
    }
}
