package bin_programms;
import java.util.*;
class problem_solution{
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            problem s = new Solution();
            do{
            System.out.println("enter the operation do you want ");
            var a=sc.next();
            if(a.equals("add")){
            s.add();
        }else if(a.equals("sub")){
            s.sub();
        }else if(a.equals("div")){
            s.div();
        }else if(a.equals("mul")){
            s.mul();
        }
}while(true);
}
}
}