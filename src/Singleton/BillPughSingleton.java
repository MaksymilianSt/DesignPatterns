package Singleton;

public class BillPughSingleton {
    private BillPughSingleton() {}

    /**
     * The inner static class is loaded only when it's first referenced,
     * leveraging the ClassLoader for lazy initialization.
     */
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
