package ChainOfResponsibility;

public class RoleHandler extends Handler {
    private final static String ADMIN_ROLE = "admin";

    @Override
    public boolean handle(String username, String password) {
        return ADMIN_ROLE.equals(username) && handleNext(username, password);
    }
}
