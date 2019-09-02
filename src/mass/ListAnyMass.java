package mass;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;

public class ListAnyMass {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
        fileWrite(list);
    }

    public static ArrayList<int[]> createList() {
        /*ArrayList<int[]> listMass = new ArrayList<>();
        int[] massFive = new int[5];
        for(int i = 0; i < massFive.length; i++) massFive[i] = i;
        listMass.add(massFive);
        int[] massTwo = new int[2];
        for(int i = 0; i < massTwo.length; i++) massTwo[i] = i;
        listMass.add(massTwo);
        int[] massFour = new int[4];
        for(int i = 0; i < massFour.length; i++) massFour[i] = i;
        listMass.add(massFour);
        int[] massSeven = new int[7];
        for(int i = 0; i < massSeven.length; i++) massSeven[i] = i;
        listMass.add(massSeven);
        int[] massZero = new int[0];
        for(int i = 0; i < massZero.length; i++) massZero[i] = i;
        listMass.add(massZero);*/

        ArrayList<int[]> listMass = new ArrayList<>();


        int[] dlinaMass = {5,2,4,7,0};

        Random random = new Random();
        for(int i = 0; i < dlinaMass.length; i++){
            int[] masive = new int[dlinaMass[i]];
            for(int valueMass = 0; valueMass < masive.length; valueMass++) masive[valueMass] = random.nextInt(100);
            listMass.add(masive);
        }

        return listMass;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }
    public static void fileWrite(ArrayList<int[]> list){
        try(FileWriter fileWriter = new FileWriter("c:/test.txt", false)){
            for(int[] masive: list){
                for(int number: masive){
                    fileWriter.write(String.valueOf(number + " "));
                }
                fileWriter.append('\n');
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
