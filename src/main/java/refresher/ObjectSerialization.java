package refresher;

import java.io.*;

public class ObjectSerialization {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle("Bike", 647);
        Vehicle car = new Vehicle("Car", 692);

        File file = new File("src/main/resources/vehicles");
        file.mkdir();
        file = new File("src/main/resources/vehicles/vehicles.dat");
        try {
            file.createNewFile();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        try(FileOutputStream foc = new FileOutputStream(file)) {
            try(ObjectOutputStream obj = new ObjectOutputStream(foc)){
                obj.writeObject(bike);
                obj.writeObject(car);
                System.out.println("Object written to file successfully");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
