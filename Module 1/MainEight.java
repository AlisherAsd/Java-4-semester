import java.util.Scanner;

// Дано кубическое уравнение ax3+bx2+cx+d=0(a≠0)
// Известно, что у этого уравнения ровно один корень. Требуется его найти.
// Программа находит корень кубического уравнения методом бинарного поиска

public class MainEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Считываем коэффициенты уравнения
        System.out.println("Введите коэффициент a:");
        int a = scanner.nextInt();
        
        System.out.println("Введите коэффициент b:");
        int b = scanner.nextInt();
        
        System.out.println("Введите коэффициент c:");
        int c = scanner.nextInt();
        
        System.out.println("Введите коэффициент d:");
        int d = scanner.nextInt();
        
        // Поиск корня методом деления отрезка пополам (бинарный поиск)
        // Задаем начальные границы поиска
        double left = -1000, right = 1000;
        
        // Продолжаем поиск, пока интервал не станет достаточно малым
        while (right - left > 1e-8) {
            // Находим середину текущего интервала
            double mid = (left + right) / 2;
            // Вычисляем значение функции в средней точке
            double value = a * mid * mid * mid + b * mid * mid + c * mid + d;
            
            // Сужаем интервал поиска в зависимости от знака функции
            if (value > 0) {
                right = mid; // Если значение положительное, корень слева
            } else {
                left = mid;  // Если значение отрицательное, корень справа
            }
        }
        
        // Выводим найденный корень с точностью до 4 знаков после запятой
        System.out.println("Корень уравнения:");
        System.out.printf("%.4f\n", (left + right) / 2);
    }
}