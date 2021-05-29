package networkAndStreams;

public class RunThreads implements Runnable {

    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
        alpha.setName("thread alpha");
        beta.setName("thread beta");
        alpha.start();
        beta.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Current thread is " + threadName);
        }

    }
}
