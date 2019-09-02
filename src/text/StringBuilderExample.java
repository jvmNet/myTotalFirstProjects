package text;

public class StringBuilderExample {

    private static StringBuilder sb;

    public static void main(String[] args) {

        String text = "Hello & job & food&root&door&";

        String[] partsText = text.split("&");

        sb = new StringBuilder(text.length())
                .append(partsText[0])
                .append(partsText[1])
                .append(partsText[2])
                .append(partsText[3]);


        System.out.println(sb);

    }

}
