package Recursions;
public class infinite_recursion {
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        System.out.println(1);
        function();
    }
}
