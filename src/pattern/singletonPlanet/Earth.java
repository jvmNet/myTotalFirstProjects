package pattern.singletonPlanet;

public class Earth implements Planet {
    private static final Object sync = new Object();
    private static Earth instance = null;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instance == null)
            synchronized (sync) {
                if (instance == null)
                    instance = new Earth();
                return instance;
            }
        return instance;
    }
}
