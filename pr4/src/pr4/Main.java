package pr4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executorService =
                Executors.newFixedThreadPool(18);

        executorService.submit(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Я не спал всю ночь");
        });
        executorService.submit(() -> System.out.println("Start"));
    }
}
