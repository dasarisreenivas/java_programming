package Recursions;
import java.util.*;
public class valid_palidrome_string {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String a =sc.nextLine();
        int b =0;
        System.out.println(valid(a,b));
        sc.close();
    }
    public static boolean valid(String s,int i){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return valid(s,i+1);
    }
}
