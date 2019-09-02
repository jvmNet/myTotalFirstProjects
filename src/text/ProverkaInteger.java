package text;

import java.io.*;
public class ProverkaInteger {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int result = 1;

        while(true) {
            String sNumber = reader.readLine();
            int nNumber = Integer.parseInt(sNumber);
            result = result *nNumber;

            if(nNumber == -1) break;

        }
        System.out.println(result);
    }
}

