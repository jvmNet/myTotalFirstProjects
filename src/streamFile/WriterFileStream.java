package streamFile;

import java.io.*;

public class WriterFileStream {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("/home/........"), "UTF-8"));

        //ArrayList<String> list = new ArrayList<>();

        String checkWord = "exit";
        while(true) {

            String text = reader.readLine();
            writer.write(text);
            writer.newLine();

            if(checkWord.equals(text)) break;
        }
        /*
        for(int i = 0; i < list.size(); i++) {
            writer.write(list.get(i) + "\n");
        }
        */

        reader.close();
        writer.close();
    }
}
