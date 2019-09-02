package streamFile;


import java.io.*;

public class ExampleCopyStream {

    public static InputStream getFileInputStream(String sourceFile) throws FileNotFoundException {
        return new FileInputStream(sourceFile);
    }

    public static OutputStream getOutputInputStream(String destinationFile) throws FileNotFoundException {
        return new FileOutputStream(destinationFile);
    }

    public static void main(String[] args) throws IOException {

        InputStream fileInputStream = getFileInputStream("/home/........");
        OutputStream fileOutputStream = getOutputInputStream("/home/.........");

        byte[] buffer = new byte[fileInputStream.available()];

        fileInputStream.read(buffer, 0, buffer.length);
        fileOutputStream.write(buffer, 0, buffer.length);

        System.out.println("Size byte: " + buffer.length);

    }
}
