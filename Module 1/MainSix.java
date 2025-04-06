import java.util.Scanner;
import java.util.HashMap;

// Дано два массива. Для каждого элемента второго массива определите, сколько раз он встречается в первом массиве.

public class MainSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Считываем размер первого массива
        System.out.println("Введите размер первого массива:");
        int N = scanner.nextInt();
        
        // Создаем HashMap для подсчета частоты элементов
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Считываем элементы первого массива и подсчитываем их частоту
        System.out.println("Введите " + N + " элементов первого массива:");
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            // Добавляем элемент в map или увеличиваем его счетчик на 1
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Считываем размер второго массива
        System.out.println("Введите размер второго массива:");
        int M = scanner.nextInt();
        
        // Для каждого элемента второго массива выводим частоту его появления в первом массиве
        System.out.println("Введите " + M + " элементов второго массива:");
        for (int i = 0; i < M; i++) {
            int num = scanner.nextInt();
            // Получаем частоту элемента из map (0 если элемент не найден)
            System.out.print(map.getOrDefault(num, 0) + " ");
        }
    }
}