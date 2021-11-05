package refresher;

import java.io.*;

public class FileHandling {
    private static final String FILE_CREATION_ERROR_MESSAGE = "An error occurred while creating file";
    private static final String FILE_CREATION_SUCCESS_MESSAGE = "File has been created successfully";
    private static final String DIR_CREATION_SUCCESS_MESSAGE = "Directory has been created successfully";
    private static final String WRITING_TO_FILE_ERROR_MESSAGE = "An error occurred while writing to file";
    private static final String READING_FROM_FILE_ERROR_MESSAGE = "An error occurred while reading from the file";
    private static final String FILE_NOT_FOUND_ERROR_MESSAGE = "FIle not found within specified path";
    public static void main(String[] args) {
        //Create a directory named studyEasy in the resources directory of this project
        //Create a sub-directory named authors
        //Create a file named names.txt
        //Read the data in the file created
        String relativePathToDir = "src/main/resources/studyEasy/author";
        String relativePathToFile = relativePathToDir.concat("/names.txt");

        File file = new File(relativePathToDir);
        file.mkdirs();
        System.out.println(DIR_CREATION_SUCCESS_MESSAGE);
        file = new File(relativePathToFile);
        try {
            file.createNewFile();
            System.out.println(FILE_CREATION_SUCCESS_MESSAGE);
        } catch (IOException exception) {
            System.out.println(FILE_CREATION_ERROR_MESSAGE);
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Mosh");
            writer.newLine();
            writer.write("Chaand");
            writer.newLine();
            writer.write("JavaBrains");
            writer.newLine();
            writer.write("End of line **********");
        } catch (IOException exception) {
            System.out.println(WRITING_TO_FILE_ERROR_MESSAGE);
        }

        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "";
            System.out.println("Reading from " + file + " started....");
            while((line =reader.readLine()) != null){
                System.out.println(line);
            }
            System.out.println("Line reading complete");
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println(FILE_NOT_FOUND_ERROR_MESSAGE);
        } catch (IOException exception) {
            System.out.println(READING_FROM_FILE_ERROR_MESSAGE);
        }


    }

    private static String createFile(String relativePath){
        File file = new File(relativePath);
        try{
            file.createNewFile();
        }
        catch (IOException exception) {
            System.out.println(FILE_CREATION_ERROR_MESSAGE);
        }
        return FILE_CREATION_SUCCESS_MESSAGE;
    }

    public static String createDirectory(String relativePath, String subDirectory){
        File file = new File(relativePath.concat(subDirectory));
        file.mkdirs();
        return FILE_CREATION_SUCCESS_MESSAGE;
    }

    public static String createDirectory(String relativePath){
        File file = new File(relativePath);
        return FILE_CREATION_SUCCESS_MESSAGE;
    }


}
