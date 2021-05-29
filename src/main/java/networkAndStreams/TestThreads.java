package networkAndStreams;

public class TestThreads {

    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        Thread one = new Thread(t1);
        Thread two = new Thread(t2);
        two.start();
        one.start();
    }
}

class Accum {

    private static Accum a = new Accum();

    private int counter = 0;

    private Accum() { }

    public static Accum getAccum() {
        return a;
    }

    public void updateCounter(int add) {
        counter+=add;
    }

    public int getCount() {
       return counter;
    }
}

class ThreadOne implements Runnable {

    Accum a = Accum.getAccum();
    @Override
    public void run() {
        for (int i = 0;i < 98; i++) {
            a.updateCounter(1000);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) { }
        }
        System.out.println("Один " + a.getCount());
    }
}

class ThreadTwo implements Runnable {

    Accum a = Accum.getAccum();
    @Override
    public void run() {
        for (int i = 0;i < 99; i++) {
            a.updateCounter(1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) { }
        }
        System.out.println("Два " + a.getCount());
    }
}