package Files_in_java;

import java.io.IOException;
import java.io.File;

public class creating_deleting_exists_file {
    public static void main(String[]args) throws IOException{
        File f = new File("D:\\textFile\\resume.txt");
        if(f.exists())
            f.delete();
        System.out.println(f.createNewFile());   
    }
}
