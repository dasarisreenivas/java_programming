package Files_in_java;
import java.io.*;
public class creating_the_file {
    public static void main (String[]args) throws IOException{
    File f = new File("D:\\textFile\\resume 2");
    System.out.println(f.createNewFile());
    System.out.println(f.isHidden());
}
}
