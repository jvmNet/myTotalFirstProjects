package mass.sorted;

public class LineSortedMass {
    public static void main(String[] args){
        int[] mass = {234,234,234,54565,67668,78,7995,665,2313,2,667,8,78,-12,124,4534,32,56};

        for(int e1 = 0; e1 < mass.length; e1++){
            int min = mass[e1];
            int iMin = e1;
            for(int e2 = e1; e2 < mass.length; e2++){
                if(mass[e2] < min){
                    min = mass[e2];
                    iMin = e2;
                }
            }if(e1 != iMin){
                int temp = mass[e1];
                mass[e1] = mass[iMin];
                mass[iMin] = temp;
            }
        }

        for(Integer masive: mass){
            System.out.print(masive + " ");
        }
    }
}
