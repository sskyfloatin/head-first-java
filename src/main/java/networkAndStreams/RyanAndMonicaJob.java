
package networkAndStreams;
public class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    @Override
    public void run() {
        for (int i = 0;i < 10;i++) {
            makeWithdrawal(10);
            if(account.getBalance() < 0) {
                System.out.println("Out of limit.");
            }
        }
    }

    private synchronized void makeWithdrawal(int amount) {
        if(account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw money.");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep.");
                Thread.sleep(500);
            } catch (InterruptedException ex) {ex.printStackTrace();};
            System.out.println(Thread.currentThread().getName() + " is not sleeping.");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes operation.");
        }
        else {
            System.out.println("Sorry, for client " + Thread.currentThread().getName() + " not enough money to withdraw.");
        }
    }
}


