package refresher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingWithScanner {
    private static final String FILE_NOT_FOUND_ERROR_MESSAGE = "Could not locate the specified file";
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/studyEasy/author/names.txt"));
            String line = "";
            while(scanner.hasNext()){
                line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(FILE_NOT_FOUND_ERROR_MESSAGE);
        }
    }
}
