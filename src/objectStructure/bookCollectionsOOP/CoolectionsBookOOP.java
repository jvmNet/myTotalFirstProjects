package objectStructure.bookCollectionsOOP;

import java.util.LinkedList;
import java.util.List;

public class CoolectionsBookOOP {
    public static class MarkTwainBook extends Book {
        private String title = null;

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

    public static class AgathaChristieBook extends Book {
        private String title = null;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return this.title;
        }
    }

    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "output";

            if(getBook() instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
                return output;
            }
            if(getBook() instanceof MarkTwainBook) {
                output = markTwainOutput;
                return output;
            }
            throw new RuntimeException();
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
