import java.util.Scanner;
import java.util.Arrays;

// Программа для выполнения двоичного поиска элементов в отсортированном массиве
public class MainFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Получаем размер первого массива
        System.out.println("Введите количество элементов в массиве 1:");
        int N = scanner.nextInt();
        
        // Получаем количество элементов для поиска
        System.out.println("Введите количество элементов в массиве 2:");
        int K = scanner.nextInt();
        
        // Создаем и заполняем первый массив
        System.out.println("Введите " + N + " элементов первого массива (в отсортированном порядке):");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Ищем каждый элемент из второго массива в первом
        System.out.println("Введите " + K + " элементов для поиска:");
        for (int i = 0; i < K; i++) {
            int target = scanner.nextInt();
            int left = 0;
            int right = arr.length - 1;
            int index = -1;
            
            // Выполняем двоичный поиск
            while (left <= right) {
                int mid = left + (right - left) / 2; // Находим средний элемент
                if (arr[mid] == target) {
                    index = mid; // Элемент найден
                    break;
                } else if (arr[mid] < target) {
                    left = mid + 1; // Ищем в правой половине
                } else {
                    right = mid - 1; // Ищем в левой половине
                }
            }
            // Выводим результат поиска
            System.out.println(index >= 0 ? "YES" : "NO");
        }
    }
}