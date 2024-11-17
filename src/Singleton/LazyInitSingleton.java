package Singleton;

public class LazyInitSingleton {
    private static LazyInitSingleton instance;

    private LazyInitSingleton() {}

    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            synchronized (LazyInitSingleton.class) {
                if (instance == null) {
                    instance = new LazyInitSingleton();
                }
            }
        }
        return instance;
    }
}
