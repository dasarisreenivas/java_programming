package Recursions;
public class infinite_number_until_ran_out_of_memory {
    static int cnt=0;
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        System.out.println(cnt);
        cnt++;
        function();
    }
}
