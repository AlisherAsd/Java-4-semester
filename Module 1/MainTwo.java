import java.util.Scanner;

// Циклический сдвиг вправо
public class MainTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Выполняем циклический сдвиг вправо
        int last = arr[n-1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        
        // Выводим результат
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}