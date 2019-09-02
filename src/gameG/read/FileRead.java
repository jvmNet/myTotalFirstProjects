package gameG.read;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileRead {

    private String line = null;
    private List<String> mass = null;

    public List<String> allFile(){
        try{
            readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return mass;
    }

    public String lineFile(){
        try{
            readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return line;
    }

    private void readFile() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        BufferedReader fileInputStream = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        line = fileInputStream.readLine();

        mass = new ArrayList<String>();
        String readLine = null;
        while((readLine = fileInputStream.readLine()) != null){
            if(!readLine.isEmpty()) mass.add(readLine);
        }

        fileInputStream.close();
    }
}
