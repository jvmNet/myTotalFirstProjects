package fibo;

public class Fibo {
    static int count = 0;

    public static void main(String[] args) {

        double[] mass = new double[55];

        for(int i = 1; i < 25; i++) {
            count = i;
            mass[i] = fibo(i);
        }

        System.out.println();

        double result = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            result = mass[i + 1] / mass[i];
            System.out.println(i + ".  " + result);
        }
    }

    static int fibo(int a) {
        if(a == 1) return 1;
        if(a == 2) return 2;
        if(count == a)
            System.out.println(fibo(a - 1) + " + " + fibo(a - 2) + " = "
                    + (fibo(a - 1) + fibo(a - 2)));
        return fibo(a - 1) + fibo(a - 2);
    }
}
