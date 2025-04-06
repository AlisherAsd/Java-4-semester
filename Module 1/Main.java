import java.util.Scanner;
import java.util.HashSet;

// Дано N чисел, требуется выяснить, сколько среди них различных.

public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода
        Scanner scanner = new Scanner(System.in);
        
        // Считываем количество чисел
        System.out.println("Введите количество чисел N:");
        int N = scanner.nextInt();
        
        // Создаем HashSet для хранения уникальных чисел
        HashSet<Integer> set = new HashSet<>();
        
        // Считываем N чисел и добавляем их в множество
        System.out.println("Введите " + N + " чисел:");
        for (int i = 0; i < N; i++) {
            set.add(scanner.nextInt());
        }
        
        // Выводим количество различных чисел
        System.out.println("Количество различных чисел: " + set.size());
    }
}

