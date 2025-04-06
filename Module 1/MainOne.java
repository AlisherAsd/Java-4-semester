import java.util.Scanner;

// Количество элементов, больших предыдущего
public class MainOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}