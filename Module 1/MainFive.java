import java.util.Scanner;

// Программа для поиска левой и правой границы вхождения числа в отсортированном массиве
public class MainFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Считываем размер массива N и количество запросов M
        System.out.println("Введите размер массива N и количество запросов M:");
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];
        
        // Заполняем массив отсортированными числами
        System.out.println("Введите " + N + " чисел в отсортированном порядке:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Обрабатываем M запросов
        System.out.println("Введите " + M + " чисел для поиска:");
        for (int i = 0; i < M; i++) {
            int target = scanner.nextInt();
            int left = findLeft(arr, target);
            if (left == -1) {
                // Если число не найдено, выводим 0
                System.out.println(0);
            } else {
                // Иначе находим правую границу и выводим позиции
                int right = findRight(arr, target);
                System.out.println((left + 1) + " " + (right + 1));
            }
        }
    }
    
    // Метод для поиска левой границы вхождения числа
    private static int findLeft(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                // Сдвигаем правую границу влево
                right = mid - 1;
            } else {
                // Сдвигаем левую границу вправо
                left = mid + 1;
            }
            if (arr[mid] == target) {
                result = mid;
            }
        }
        return result;
    }
    
    // Метод для поиска правой границы вхождения числа
    private static int findRight(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                // Сдвигаем левую границу вправо
                left = mid + 1;
            } else {
                // Сдвигаем правую границу влево
                right = mid - 1;
            }
            if (arr[mid] == target) {
                result = mid;
            }
        }
        return result;
    }
}