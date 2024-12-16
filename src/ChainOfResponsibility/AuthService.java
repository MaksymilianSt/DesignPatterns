package ChainOfResponsibility;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean authenticate(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("User " + username + " successfully logged in.");
            return true;
        }
        return false;
    }
}
