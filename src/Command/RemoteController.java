package Command;


public class RemoteController {
    private Command command;

    public RemoteController(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
        log(command.describe());
    }

    public void pressUndo() {
        command.unexecute();
        log("Undo: " + command.describe());
    }

    private void log(String message) {
        System.out.println("LOG: " + message);
    }
}
