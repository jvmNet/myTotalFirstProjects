import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HtmlRequest {
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[10];

        int contains_array = numbers.length;
        while(0 < contains_array){
            try{
                numbers[contains_array - 1] = Integer.parseInt(read.readLine());
            } catch (IOException e){
                System.out.println(e.getMessage());
            }
            contains_array--;
        }

        try{
            read.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        HtmlRequest lineSorted = new HtmlRequest();
        lineSorted.sorted(numbers);
        lineSorted.printArrayConsole(numbers);

    }

    private void sorted(final int[] array_numbers)
    {
        int temp = 0;
        for(int i = 0; i < array_numbers.length; i++){
            int min = array_numbers[i];
            int index = i;
            for(int j = i + 1; j < array_numbers.length; j++){
                if(array_numbers[j] < min){
                    min = array_numbers[j];
                    index = j;
                }
            }
            if(i != index){
                temp = min;
                array_numbers[index] = array_numbers[i];
                array_numbers[i] = temp;
            }
        }
    }

    private void printArrayConsole(final int[] array)
    {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
