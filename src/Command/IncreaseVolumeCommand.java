package Command;

public class IncreaseVolumeCommand implements Command {
    private TV tv;

    public IncreaseVolumeCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.increaseVolume();
    }

    @Override
    public void unexecute() {
        tv.decreaseVolume();
    }

    @Override
    public String describe() {
        return "increase volume";
    }
}
