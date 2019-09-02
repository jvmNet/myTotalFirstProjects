package objectStructure.factoryHen;

public class App {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        Hen hen1 = HenFactory.getHen(Country.UKRAINE);
        Hen hen2 = HenFactory.getHen(Country.RUSSIA);

        print(hen.getDescription());
        print(hen1.getDescription());
        print(hen2.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;

            if(country.equals(Country.BELARUS))
                hen = new BelarusianHen();

            if(country.equals(Country.MOLDOVA))
                hen = new MoldovanHen();

            if(country.equals(Country.RUSSIA))
                hen = new RussianHen();

            if(country.equals(Country.UKRAINE))
                hen = new UkrainianHen();

            return hen;
        }
    }

    public static void print(final String text) {
        System.out.println(text);
    }
}
