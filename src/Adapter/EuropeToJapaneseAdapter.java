package Adapter;

public class EuropeToJapaneseAdapter implements JapaneseDevice{
    private final EuropeDevice europeDevice;

    public EuropeToJapaneseAdapter(EuropeDevice europeDevice) {
        this.europeDevice = europeDevice;
    }

    @Override
    public void powerOn() {
        europeDevice.on();
    }
}
