package Files_in_java;
import java.io.*;
public class File_handling {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\textFile\\resume.txt");
        //System.out.println(f.createNewFile());
        //System.out.println(f.delete());
        System.out.println(f.exists());
    }
}
