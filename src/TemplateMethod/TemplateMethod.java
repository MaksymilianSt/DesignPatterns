package TemplateMethod;

public abstract class TemplateMethod {

    public final String fetchData() {
        startConnection();
        String query = makeQuery();
        String result = sendRequest(query);
        logResult(result);
        return result;
    }

    protected void startConnection() {
        System.out.println("starting connection");
    }

    protected String sendRequest(String query) {
        System.out.println("sending request");
        return "result";
    }

    protected abstract String makeQuery();

    protected abstract void logResult(String result);
}
