package Command;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteController on = new RemoteController(new TurnOnTVCommand(tv));
        on.pressButton();
        on.pressUndo();

        RemoteController volume = new RemoteController(new IncreaseVolumeCommand(tv));
        volume.pressButton();
        volume.pressButton();
        volume.pressUndo();
    }
}
