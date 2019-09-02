package mass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MethodCreateArrayListMass {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) list.add(reader.readLine());

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for(String mass: result) System.out.println(mass);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> mass = new ArrayList<>(list);
        for(int i = mass.size() - 1; i >= 0; i--) mass.add(i + 1,mass.get(i));
        return mass;
    }
}
