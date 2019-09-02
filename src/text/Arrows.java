package text;

public class Arrows {
    public static void main(String[] args) {

       String text = "<>-->->>-->-<--<<-->--<<--<--<<--";

       int countLine1 = 0;
       int countLine2 = 0;

       String line1 = ">>-->";
       String line2 = "<--<<";


       for(int i = 0; i < text.length() - 5; i++){
           if((text.substring(i, i + 5)).contains(line2)) countLine2++;
       }

        for(int i = 0; i < text.length() - 5; i++){
            if((text.substring(i, i + 5)).contains(line1)) countLine1++;
        }

        System.out.println(countLine1);
        System.out.println(countLine2);

    }
}
