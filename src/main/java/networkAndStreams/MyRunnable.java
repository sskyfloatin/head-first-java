package networkAndStreams;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("top of the stack");
    }
}

class ThreadTestDrive {
    public static void main(String[] args) {
        Runnable  theJob = new MyRunnable();
        Thread t = new Thread(theJob);
        t.start();
        System.out.println("Back to main method");
    }
}
