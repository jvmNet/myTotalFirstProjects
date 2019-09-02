package inputStreamFile;

import java.io.*;

public class CheckExistFileCopyFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName;
        String destinationFileName;
        File file;

        while(true) {
            sourceFileName = reader.readLine();
            destinationFileName = reader.readLine();

            file = new File(sourceFileName);

            if(file.exists()) {
                break;
            } else {
                System.out.println("Файл не существует.");
            }
        }

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);


        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
