package Command;

public class TurnOnTVCommand implements Command {
    private TV tv;

    public TurnOnTVCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOn();
    }

    @Override
    public void unexecute() {
        tv.turnOff();
    }

    @Override
    public String describe() {
        return "Turn On TV";
    }
}
