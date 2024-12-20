package ChainOfResponsibility;


public abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        return this.next = next;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }
}
