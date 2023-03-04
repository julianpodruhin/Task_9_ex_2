
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args)
    {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long start, end, n;

        start = System.currentTimeMillis(); // Время начала в миллисекундах
        for (int i = 0; i < 1000000; i++) {
            arrayList.add((int) (Math.random() * 10));
        }
        end = System.currentTimeMillis();   // Время конца в миллисекундах
        System.out.println("Время заполнения ArrayList: " + (end - start) + " мс.");

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add((int) (Math.random() * 10));
        }
        end = System.currentTimeMillis();
        System.out.println("Время заполнения LinkedList: " + (end - start) + " мс.");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            n = arrayList.get((int) (Math.random() * 1000000));
        }
        end = System.currentTimeMillis();
        System.out.println("Время выбора элемента из ArrayList: " + (end - start) + " мс.");

        start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            n = linkedList.get((int) (Math.random() * 1000000));
        }
        end = System.currentTimeMillis();
        System.out.println("Время выбора элемента из LinkedList: " + (end - start) + " мс."); // Ждать надо долго, минуты 2
        // Поиск элемента у ArrayList занимает O(1) времени.
        // Поиск элемента у LinkedList занимает O(n) времени.
        // Из-за этого получается такая разница.
    }
}
