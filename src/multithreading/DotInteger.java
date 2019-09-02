package multithreading;

public class DotInteger {

    public static final int SIZE_NUMBER_TEST = 2_000_000;

    private final int x;

    private final int y;

    public DotInteger(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public DotInteger() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static void main(String[] args) {

        new DotInteger().showThread();

        for(int i = 0; i < SIZE_NUMBER_TEST; i++) {
            for(int i2 = 0; i2 < 100; i2++) {
                new DotInteger(0, 0);
            }
        }

    }

    private void showThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i < SIZE_NUMBER_TEST) {
                    if(getX() != getY())
                        System.out.printf("0_0 %d %d \n", getX(), getY());
                    i++;
                }
            }
        }).start();
    }
}
