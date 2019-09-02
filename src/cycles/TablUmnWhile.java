package cycles;

import java.io.*;
public class TablUmnWhile {
    public static void main(String[] args) throws Exception {

        int i = 1;
        while(i <= 10){
            System.out.println();
            int r = 1;
            while( r <= 10){
                int result = r * i;
                System.out.print(" " + result);
                r++;
            }
            i++;

        }
    }
}
