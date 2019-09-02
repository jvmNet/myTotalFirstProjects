package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    private static final Object sync = new Object();
    private static FileOutputStream fileOutputStream = null;
    private static ObjectOutputStream objectOutputStream  = null;

    public static void main(String[] args) {

        Person personOne = new Person("Volodya", 21);
        Person personTwo = new Person("Petya", 31);
        Person personThree = new Person("Aleksandr", 27);

        fileOutputStream = getFileOutputStream("/home/compaq/test.bin");
        objectOutputStream = getObjectOutputStream(fileOutputStream);

        try{
            objectOutputStream.writeObject(personOne);
            objectOutputStream.writeObject(personTwo);
            objectOutputStream.writeObject(personThree);

            System.out.println("write file success");

        } catch (IOException e) {
            System.out.println("no write file");
        } finally {
            try{
                if(fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("no close file output stream");
            }
        }
    }

    public static FileOutputStream getFileOutputStream(final String fileLocation) {
        if(fileOutputStream == null)
            synchronized (sync) {
                if(fileOutputStream == null) {
                    try{
                        fileOutputStream = new FileOutputStream(fileLocation);
                        return fileOutputStream;
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found!");
                    }
                }
            }
        return fileOutputStream;
    }

    public static ObjectOutputStream getObjectOutputStream(FileOutputStream fileOutputStream) {
        if(objectOutputStream == null)
            synchronized (sync) {
                if(objectOutputStream == null) {
                    try{
                        objectOutputStream = new ObjectOutputStream(fileOutputStream);
                        return objectOutputStream;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        return objectOutputStream;
    }
}
