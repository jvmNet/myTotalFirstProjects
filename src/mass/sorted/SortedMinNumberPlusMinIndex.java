package mass.sorted;

public class SortedMinNumberPlusMinIndex {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //напишите тут ваш код
        int[] originalMass = new int[array.length];
        for(int i = 0; i < originalMass.length; i++) originalMass[i] = array[i];

        for(int i = array.length; i > 0; i--) {
            boolean check = true;
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    check = false;
                }
            }
            if(check) break;
        }

        int indexMinimumNumber = 0;
        for(int i = 0; i < originalMass.length; i++) {
            if(originalMass[i] == array[0]) indexMinimumNumber = i;
        }

        return new Pair<Integer, Integer>(array[0], indexMinimumNumber);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
