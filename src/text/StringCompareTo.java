package text;

public class StringCompareTo {
    public static void main(String[] args) {
        String textOne = "zpple";
        String textTwo = "aebra";
        String textThree = "World Hello";
        String textFour = "Hello amigo";

        int numberOne = textOne.compareTo(textTwo);

        int numberFour = textTwo.compareTo(textFour);

        System.out.println(numberOne);
        System.out.println(numberFour);

        int result = textFour.compareTo(textOne);
        System.out.println(result);

    }
}
