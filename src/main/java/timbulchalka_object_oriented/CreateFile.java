package timbulchalka_object_oriented;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{

            File file = new File("src/main/resources/timbulchakla/complexOperations.txt");
            file.createNewFile();

            System.out.println("File created successfully.");
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
