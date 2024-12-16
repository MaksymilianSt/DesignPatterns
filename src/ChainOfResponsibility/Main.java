package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();

        Handler handler = new UserExistsHandler(db);
        handler
                .setNext(new ValidPasswordHandler(db))
                .setNext(new RoleHandler());

        AuthService authService = new AuthService(handler);
        authService.authenticate("admin", "admin");
    }
}
