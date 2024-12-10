package Adapter;

public class JapaneseSocket {
    void plugIn(JapaneseDevice device){
        System.out.println("\t" + getClass().getSimpleName() + ":");
        device.powerOn();
    };
}
