import java.util.concurrent.Semaphore;

public class Worker implements Runnable {
    private final Semaphore semaphore;

    Worker(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            this.semaphore.acquire();
            System.out.println("current working thread: " + Thread.currentThread().getName());
            Thread.sleep((long) Math.random() * 1000);
            System.out.println("current working thread is released lock: " + Thread.currentThread().getName());
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            this.semaphore.release();
        }
    }
}
