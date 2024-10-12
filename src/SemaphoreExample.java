import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        IntStream.rangeClosed(1, 10).forEach(value -> new Thread(new Worker(semaphore)).start());
    }
}
