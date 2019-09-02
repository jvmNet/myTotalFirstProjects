package cycles;

import objectStructure.Animals;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**/
public class Just {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Animals cat = new Animals();
        Animals dog = new Animals();

        String sCatAge, sDogAge;
        do{
            System.out.print("Введите возраст кота: ");
            sCatAge = reader.readLine();
            cat.setCat(Integer.parseInt(sCatAge));
        }while(cat.getCat() < 0);

        do{
            System.out.print("Введите возраст собаки: ");
            sDogAge = reader.readLine();
            dog.setDog(Integer.parseInt(sDogAge));
        }while(dog.getDog() < 0);

        System.out.println("Возраст кота: " + cat.getCat());
        System.out.println("Возраст собаки: " + dog.getDog());
    }
}






