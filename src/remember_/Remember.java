package remember_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remember {

    private int _X;
    private int _Y;

    public void run(final int a,
                    final int b,
                    final int c,
                    final int d,
                    final int f){

        input();

        int _Z = _X + (a + b + c) + _Y + (d + f);
        String _read = String.valueOf(_Z);

        System.out.println(_read);
    }

    private void input(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter number _X");
                _X = Integer.parseInt(reader.readLine());
            System.out.println("Enter number _Y");
                _Y = Integer.parseInt(reader.readLine());
        } catch (IOException e){
            System.out.println("Error reader");
        }
    }
}
