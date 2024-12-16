package ChainOfResponsibility;

public class ValidPasswordHandler extends Handler {
    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        return !database.isValidPassword(username, password)
                ? false
                : handleNext(username, password);

    }
}
