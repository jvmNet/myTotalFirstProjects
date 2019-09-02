package generic;

public class TestGeneric {
    public static void main(String[] args) {
        new Digital<Integer, Integer>(12, 55).showDigit();
        Whale whale = new Whale();
        whale.printName();

        Cow cow = whale;
        cow.printName();

    }

    public static class Digital<K, V> {
        K numberOne;
        V numberTwo;

        public Digital(K numberOne, V numberTwo) {
            this.numberOne = numberOne;
            this.numberTwo = numberTwo;
        }

        public void showDigit() {
            System.out.println("Types K: " + numberOne);
            System.out.println("Types V: " + numberTwo);
        }
    }

    public static class Cow {
        public void printName() {
            System.out.println("I cow");
        }

        public void isRootCow() {
        }
    }

    public static class Whale extends Cow {
        public void printName() {
            System.out.println("I whale");
            super.printName();

        }

        public void isRootWhale() {

        }
    }
}
