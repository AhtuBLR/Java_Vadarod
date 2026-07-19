package Task20;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3); //создание пула потоков

        List<Future<List<String>>> futures = new ArrayList<>();

        //запуск 10 задач (3 задачи должны выполняться одновременно, остальные ждут свою очередь)
        for (int i = 1; i <= 10; i++) {
            futures.add(pool.submit(new FileGenerator(i)));
        }

        // Получаем результат
        for (Future<List<String>> f : futures) {
            System.out.println("Результат выполнения: " + f.get());
        }
        pool.shutdown();
    }
}
