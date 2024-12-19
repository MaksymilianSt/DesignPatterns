package Command;

public interface Command {
    void execute();

    void unexecute();

    String describe();
}
