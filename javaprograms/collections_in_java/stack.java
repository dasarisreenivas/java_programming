package collections_in_java;
import java.util.*;
public class stack {
    public static void main(String[]args){
    //stack is a class in java which implements the list interface and extends the vector class and repreents the lifo principle
    Stack<String> books = new Stack<String>();
    System.out.println(books.capacity());
    books.add("red");
    books.add("black");
    books.add(0,"white");
    System.out.println(books);
    books.remove("red"); 
    books.set(0,"yellow");
    System.out.println(books);
    System.out.println(books.get(0));
    System.out.println(books.contains("yellow"));
    books.clear();
    //special methods available in java
    /*push
     * pop
     * peek
     * search
     */
    Stack<String> book= new Stack<>();
    book.push("red");
    book.push("black");
    book.push("white");
    System.out.println(book);
    System.out.println(book.peek());
    System.out.println(book.pop());
    System.out.println(book);
    System.out.println(book.search("red"));
    System.out.println(book.empty());
    System.out.println(book.isEmpty());
    }
}
  