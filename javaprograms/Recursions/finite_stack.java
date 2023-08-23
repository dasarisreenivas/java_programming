package Recursions;
import java.util.*;
public class finite_stack {
    static int cnt=0;
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        Scanner sc = new Scanner(System.in);
        if(cnt==4){
            return ;
        }else{
            int a =sc.nextInt();
            cnt++;
            function();
        }
    }
}
