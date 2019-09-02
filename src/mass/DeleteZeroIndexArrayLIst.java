package mass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DeleteZeroIndexArrayLIst {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> massString = new ArrayList<>();
        for(int i = 0; i < n; i++) massString.add(reader.readLine());

        for(int i = 0; i < m; i++){
            massString.add(massString.remove(0));
        }

        for(String masive: massString) System.out.println(masive);
    }
}
