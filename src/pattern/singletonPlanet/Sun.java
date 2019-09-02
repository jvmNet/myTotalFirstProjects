package pattern.singletonPlanet;

public class Sun implements Planet {
    private static final Object sync = new Object();
    private static Sun instance = null;

    private Sun() {
    }

    public static Sun getInstance() {
        if (instance == null)
            synchronized (sync) {
                if (instance == null) {
                    instance = new Sun();
                    return instance;
                }
            }
        return instance;
    }
}
