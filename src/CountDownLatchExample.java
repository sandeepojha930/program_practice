import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        for (int i = 1; i<=5; i++) {
            WorkerThread thread = new WorkerThread(i, latch);
            thread.start();
        }
        latch.await();
        System.out.println("Program just finished!!");
    }
}

class WorkerThread extends Thread {
    int id;
    CountDownLatch latch;

    public WorkerThread(int id, CountDownLatch latch) {
        this.id = id;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println("WorkerThread id: " + id);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        latch.countDown();
    }
}