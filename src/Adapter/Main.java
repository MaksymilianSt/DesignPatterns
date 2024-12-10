package Adapter;

public class Main {
    public static void main(String[] args) {
        JapaneseSocket japaneseSocket = new JapaneseSocket();
        JapaneseDevice japaneseDevice = () -> {
            System.out.println("japanese device");
        };

        japaneseSocket.plugIn(japaneseDevice);

        EuropeDevice europeDevice = () -> {
            System.out.println("Europe device");
        };
        //japaneseSocket.plugIn(europeDevice); incompatible types

        EuropeToJapaneseAdapter adapter = new EuropeToJapaneseAdapter(europeDevice);
        japaneseSocket.plugIn(adapter);
    }
}
