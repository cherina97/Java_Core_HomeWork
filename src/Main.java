import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();

        myThread.join();

        RunnableThread runnableThread = new RunnableThread();
        new Thread(runnableThread).start();


    }

}
