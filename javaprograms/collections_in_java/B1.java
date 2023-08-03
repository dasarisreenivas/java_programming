package collections_in_java;
import java.util.*;
class B1{
    public static void main(String[] args) {
        ArrayList b1 = new ArrayList<>();
        b1.add("java");
        b1.add("python");
        b1.add(1);
        System.out.println(b1);
        b1.remove("java");
        System.out.println(b1);
        b1.add("java");
        System.out.println(b1);
        System.out.println(b1);
        b1.set(1,"ds");
        System.out.println(b1);
        System.out.println(b1);
    }
}