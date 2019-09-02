package mass.sorted;

import java.io.*;

public class CharListSorted {
    private String text = null;
    private char[] array = null;

    private InputStream fileInputStream = null;
    private OutputStream fileOutputStream = null;

    public CharListSorted() {
    }

    public CharListSorted(String text) {
        this.text = text;
    }

    public char[] getArray() {
        return array;
    }

    public void setArray(char[] array) {
        this.array = array;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public static void main (String[] args) throws IOException {

        CharListSorted charListSorted = new CharListSorted(new CharListSorted().inputTextConsole());
        charListSorted.createArray(charListSorted.getText());

        charListSorted.sortStringArrays(charListSorted.getArray());

        charListSorted.printArrayCharacter(charListSorted.getArray());




    }

    public String inputTextConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputText = reader.readLine();

        return inputText;
    }

    public void createArray(String text){

        setArray(text.toCharArray());

    }

    public void sortStringArrays(char[] array) {

        for(int i = array.length; i > 0; i++) {
            boolean check = true;
            for(int j = 0; j < array.length - 1; j++) {
                if(charCompare(array[j], array[j + 1])) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    check = false;
                }
            }
            if(check) break;
        }

    }

    public boolean charCompare(char a, char b) {
        return (String.valueOf(a).compareTo(String.valueOf(b))) > 0;
    }

    public void printArrayCharacter(char[] array) {
        for(Character mass: array) System.out.print(mass + " ");
    }

    public OutputStream getFileOutputStream(String destinationFile) throws IOException {
        return new FileOutputStream(destinationFile);
    }

    public InputStream getFileInputStream(String sourceFile) throws IOException {
        return new FileInputStream(sourceFile);
    }

    public void writeFile(char[] arrays) throws IOException {
        OutputStream fileOutputStream = getFileOutputStream("/home/compaq/abc.txt");


        byte[] buffer = new byte[arrays.length];
        fileOutputStream.write(buffer, 0, buffer.length);

        fileOutputStream.close();
    }

}
