package chapter11;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class BadFileDemo {
    public static Scanner openFile(String fileName){
        Scanner scan;

        //Attempt to open a file
        try {
            File file = new File(fileName);
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            scan = null;
        }
        return scan;
    }
}
