package multithreading;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileThreadExample {

    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();

            reader.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());

    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        private String fileName;

        private final List<String> content;

        public ReadFileThread() {
            this.content = new ArrayList<>();
        }

        @Override
        public void setFileName(final String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            StringBuffer sbf = new StringBuffer();

            for(String mass: this.content)
                sbf.append(mass);

            return sbf.toString();
        }

        @Override
        public void start() {
            run();
        }

        @Override
        public void run() {
            BufferedReader readerFile = null;

            try{
                readerFile = new BufferedReader(new FileReader(this.fileName));

                while(readerFile.ready()) {
                    content.add(readerFile.readLine() + " ");
                }

            } catch (FileNotFoundException e) {
                System.out.println("file not found");
            } catch (IOException e) {
                System.out.println("not file ready");
            } finally {
                try{
                    if(readerFile != null)
                        readerFile.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }

}
