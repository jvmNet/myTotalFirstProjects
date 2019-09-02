package cycles;

import java.util.Scanner;
public class TablUmn {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        int x_element_mass, y_element_mass, mass[][];
        System.out.print("Введите количество цифр: ");
        x_element_mass = key.nextInt() + 1;
        y_element_mass = x_element_mass;
        mass = new int[x_element_mass][y_element_mass];

        for(int x = 1; x < mass.length; x++){
            for(int y = 1; y < mass.length; y++){
                mass[x][y] = x * y;
                System.out.printf("%5d", mass[x][y]);
            }
            System.out.println();
        }
    }
}
