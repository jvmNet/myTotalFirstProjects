import java.util.LinkedList;
import java.util.List;

public class TestOOP {

    public static class MarkTwainBook extends Book {
        private final String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static class AgathaChristie extends Book {
        private final String title;

        public AgathaChristie(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristie getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static void main(String[] args) {
        List<Book> book = new LinkedList<>();
        book.add(new MarkTwainBook("Tom Sawyer"));
        book.add(new AgathaChristie("Evil Under the Sun "));

        printBook(book);

        System.out.println(Thread.activeCount());

    }

    public static void printBook(List<Book> list) {
        int id = 1;
        for(Book mass: list) {
            System.out.println(String.valueOf(id) + ". " + mass);
            id++;
        }
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            super();
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "output";

            if(getBook() instanceof MarkTwainBook)
                output = markTwainOutput;

            if(getBook() instanceof AgathaChristie)
                output = agathaChristieOutput;

            return output;
        }

        public String toString() {
             return getOutputByBookType();
        }
    }
}
