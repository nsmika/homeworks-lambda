public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = result -> System.out.println(result);

        OnTaskErrorListener errorListener = error -> System.err.println(error);

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}