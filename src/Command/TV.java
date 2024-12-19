package Command;

public class TV {
    private int volume = 10;

    public void turnOn() {
        System.out.println("TV on");
    }

    public void turnOff() {
        System.out.println("TV off");
    }

    public void increaseVolume() {
        volume++;
        System.out.println("volume up to: " + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("volume down to: " + volume);
    }
}