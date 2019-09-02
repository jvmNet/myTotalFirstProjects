package mass.createMass;

import java.util.ArrayList;

public class CreateArrayListEnterOtherList {
    public static void main(String[] args) {
        ArrayList<String>[] arrayList = new ArrayList[10];

        for(int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new ArrayList<String>();
            for(int j = 0; j < arrayList.length; j++) {
                arrayList[i].add("String number: " + j);
            }
        }

        for(ArrayList<String> massList: arrayList) {
            for(String massString: massList) {
                System.out.print(massString + " ");
            }
            System.out.println();
        }
    }
}
