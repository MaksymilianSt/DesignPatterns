package Adapter;

public class EuropeSocket {
    void plugIn(EuropeDevice device) {
        System.out.println("\t" + getClass().getSimpleName() + ":");
        device.on();
    };
}
