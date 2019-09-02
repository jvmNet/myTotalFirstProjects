package thinkingJava.part5;

class Book {

    boolean chekedOut = false;

    Book(boolean checkOut) {
        chekedOut = checkOut;
    }

    void checkIn() {
        chekedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        if(chekedOut) {
            System.out.println("Error: checked out");
        } else {
            System.out.println("checkOut = false");
        }

        // Обычно это делается так-:
        // super.finalize();  // Вызов версии базового класса
    }
}

public class FinalizeTermination {
    public static void main(String[] args) throws Throwable {
        Book book = new Book(true);
        book.checkIn();

        new Book(true);

        System.gc();
    }
}
