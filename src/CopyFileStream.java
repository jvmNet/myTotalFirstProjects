
import java.io.*;

public class CopyFileStream {
    private static volatile int counterByte = 0;
    private static final Object sync = new Object();
    private static InputStream inputStream = null;
    private static OutputStream outputStream = null;

    public static int getCounterByte() {
        return counterByte;
    }

    public static InputStream getFileInputStream(String fileSource)
            throws FileNotFoundException {
        if(inputStream == null)
            synchronized (sync) {
                if(inputStream == null)
                    return new FileInputStream(fileSource);
            }
        return inputStream;
    }

    public static OutputStream getFileOutputStream(String dislocationFile)
            throws FileNotFoundException {
        if(outputStream == null)
            synchronized (sync) {
                if (outputStream == null) return new FileOutputStream(dislocationFile);
            }
        return outputStream;
    }

    public static void main(String[] args) throws IOException {

        inputStream = getFileInputStream("/home/compaq/text.txt");
        outputStream = getFileOutputStream("/home/compaq/resultWriteText.txt");

        while(inputStream.available() > 0) {

            int data = inputStream.read();
            outputStream.write(data);

            counterByte++;
        }

        System.out.println("copy " + getCounterByte() + " byte");

        inputStream.close();
        outputStream.close();

    }
}
