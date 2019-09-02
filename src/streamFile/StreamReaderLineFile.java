package streamFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StreamReaderLineFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileLocation = reader.readLine();
        File file = new File(fileLocation);

        BufferedReader fileInputStream = new BufferedReader(new InputStreamReader(new FileInputStream(file)));

        List<Integer> massNumber = new ArrayList<>();

        String line;
        while((line = fileInputStream.readLine()) != null) {
            if(!line.isEmpty()) massNumber.add(Integer.parseInt(line));
        }

        fileInputStream.close();

        for(int i = massNumber.size(); i > 0; i--) {
            boolean check = true;
            for(int j = 0; j < massNumber.size() - 1; j++) {
                if(massNumber.get(j) > massNumber.get(j + 1)) {
                    massNumber.add(j + 1, massNumber.remove(j));
                    check = false;
                }
            }
            if(check) break;
        }

        for(Integer mass: massNumber) {
            if(mass%2 == 0) System.out.println(mass);
        }

    }
}
