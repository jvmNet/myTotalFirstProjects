package objectStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactoryFilmKey {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Movie movie;
        String key;
        while(isKey(key = reader.readLine())) {

            movie = MovieFactory.getMovie(key);
            System.out.println(movie.getClass().getSimpleName());

        }
    }

    public static boolean isKey(String key) {
        final String[] massKey = {"soapOpera", "cartoon", "thriller"};
        boolean check = false;
        for(int i = 0; i < massKey.length; i++) {
            if(key.equals(massKey[i]))
                check = true;
        }
        return check;
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {

    }

    static class SoapOpera extends Movie {

    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
