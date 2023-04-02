// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();

        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        List<Integer> list = Arrays.asList(array);

        Collections.sort(list);
        System.out.printf("min: %s\n", list.get(0));
        System.out.printf("max: %s\n", list.get(list.size() - 1));
        System.out.printf("mid: %s\n", list.get(list.size() / 2));
    }
}
