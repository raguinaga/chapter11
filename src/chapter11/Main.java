package chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("MyFile.txt");
            Scanner fromFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
