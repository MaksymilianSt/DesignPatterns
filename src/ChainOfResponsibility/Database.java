package ChainOfResponsibility;

import java.util.Map;

public class Database {
    private final Map<String, String> users;

    public Database() {
        users = Map.of(
                "admin", "admin",
                "user", "user"
        );
    }

    public boolean isValidUser(String username) {
        return users.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        return password.equals(users.get(username));
    }
}
