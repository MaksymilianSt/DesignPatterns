package ChainOfResponsibility;

public class UserExistsHandler extends Handler {
    private final Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("User " + username + " does not exist");
            return false;
        }
        return handleNext(username, password);
    }
}
