package serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ObjectReader {
    private static final Object sync = new Object();
    private static FileInputStream fileInputStream = null;
    private static ObjectInputStream objectInputStream = null;

    private static Person[] person = null;

    public static void main(String[] args) {

        fileInputStream = getFileInputStream("/home/compaq/test.bin");
        objectInputStream = getObjectInputStream(fileInputStream);

        try{
            int countPerson = objectInputStream.readInt();
            System.out.println(countPerson);
            person = new Person[countPerson];

            for(int i = 0; i < countPerson; i++) {
                person[i] = (Person) objectInputStream.readObject();
            }

            System.out.println(Arrays.toString(person));

        } catch (IOException e) {
            System.out.println("file not reader");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } finally {
            try{
                if(fileInputStream != null) fileInputStream.close();
                System.out.println("reader stream of close");
            } catch (IOException e) {
                System.out.println("no close stream read");
            }
        }
    }

    public static FileInputStream getFileInputStream(final String fileName) {
        if(fileInputStream == null)
            synchronized (sync) {
                if(fileInputStream == null) {
                    try{
                        fileInputStream = new FileInputStream(fileName);
                        return fileInputStream;
                    } catch (FileNotFoundException e) {
                        System.out.println("file not found");
                    }
                }
            }
        return fileInputStream;
    }

    public static ObjectInputStream getObjectInputStream(FileInputStream fileInputStream) {
        if(objectInputStream == null)
            synchronized (sync) {
                if(objectInputStream == null) {
                    try{
                        objectInputStream = new ObjectInputStream(fileInputStream);
                        return objectInputStream;
                    } catch (IOException e) {
                        e.getMessage();
                    }
                }
            }
        return objectInputStream;
    }
}
