package refresher;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjFile {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("src/main/resources/vehicles/vehicles.dat")) {
            try(ObjectInputStream obj = new ObjectInputStream(fis)){
                Vehicle v1 = (Vehicle) obj.readObject();
                Vehicle v2 = (Vehicle) obj.readObject();
                System.out.println("Object 1 " + v1);
                System.out.println("Object 2 " + v2);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
