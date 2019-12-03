import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class MainTask2 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        MyThread myThread = new MyThread();
        Thread runnableThread = new Thread(new RunnableThread());
        executorService.submit(myThread);
        executorService.submit(runnableThread);
        executorService.shutdown();


        ScheduledExecutorService singleThread = Executors.newSingleThreadScheduledExecutor();
        MyThread myThread2 = new MyThread();
        Thread runnableThread2 = new Thread(new RunnableThread());
        singleThread.submit(myThread2);
        singleThread.submit(runnableThread2);
        singleThread.shutdown();

    }
}
