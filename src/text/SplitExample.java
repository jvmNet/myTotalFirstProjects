package text;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplitExample {
    private static BufferedReader reader = null;
    private static StringBuilder sb = null;
    private static String[] partsURL = null;

    public static void main(String[] args) throws IOException {
        reader = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder(reader.readLine());

        partsURL = sb.substring(sb.indexOf("?") + 1).split("&");



    }
}
