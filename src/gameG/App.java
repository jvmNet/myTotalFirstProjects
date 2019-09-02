package gameG;

import gameG.check.Check;
import gameG.output.Console;
import gameG.read.FileRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args){

        FileRead fileRead = new FileRead();
        Console console = new Console();
       // console.output(fileRead.allFile());

        Dear dear = new Dear();

        dear.input();

        Console.printText(dear.name);
        Console.printText(dear.age);
        Console.printText(dear.street);

    }
}

class Dear{

    String name   = null;
    String street = null;
    int age     = 0;

    void printName(){
        Console.printText(name);
    }

    void input() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            Console.printText("Введите имя:");
            name = reader.readLine();
            Console.printText("Введите возраст:");
            while(true){
                age = Integer.parseInt(reader.readLine());
                if(Check.checkAge(age, Data.AGE_MIN, Data.AGE_MAX))
                    break;
            }
            Console.printText("Введите улицу:");
            street = reader.readLine();
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.getMessage();
                Console.printText("Stream close!");
            }
        }
    }
}
