// Пусть дан произвольный список целых чисел, удалить из него чётные числа
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 20, 3, 58, 15, 13, 28, 22};
        //System.out.println(Arrays.toString(array));
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                list.add(array[i]);
            }
        }

        System.out.println(list);
    }
}
