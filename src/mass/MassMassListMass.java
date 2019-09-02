package mass;

import java.util.ArrayList;

public class MassMassListMass {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> massList = new ArrayList<>();

        int[] fiveMass = new int[5];
        for(int i = 0; i < fiveMass.length; i++) fiveMass[i] = i;
        massList.add(fiveMass);

        int[] twoMass = new int[2];
        for(int i = 0; i < twoMass.length; i++) twoMass[i] = i;
        massList.add(twoMass);

        int[] fourMass = new int[4];
        for(int i = 0; i < fourMass.length; i++) fourMass[i] = i;
        massList.add(fourMass);

        int[] sevenMass = new int[7];
        for(int i = 0; i < sevenMass.length; i++) sevenMass[i] = i;
        massList.add(sevenMass);

        int[] zeroMass = new int[0];
        for(int i = 0; i < zeroMass.length; i++) zeroMass[i] = i;
        massList.add(zeroMass);

        return massList;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
