import java.util.Locale;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите x (интервал от -1 до 1): ");
        double x = scanner.nextDouble();
        
        if (x <= -1 || x >= 1) {
            System.out.println("Ошибка: x должен быть в интервале (-1, 1)");
            return;
        }

        System.out.print("Введите количество слагаемых n: ");
        int n = scanner.nextInt();

        System.out.print("Введите точность e: ");
        double e = scanner.nextDouble();

        double sumN = 0;
        double sumE = 0;
        double sumE10 = 0;

        double a = -x; 

        for (int i = 1; i <= n; i++) {
            sumN += a;

            if (Math.abs(a) > e) {
                sumE += a;
            }

            if (Math.abs(a) > (e / 10)) {
                sumE10 += a;
            }

            a = a * x * i / (i + 1);
        }

        double exValue = Math.log((1 - x * x) / (1 + x));

        System.out.printf(Locale.US, "1) Сумма %d слагаемых заданного вида: %.6f%n", n, sumN);
        System.out.printf(Locale.US, "2) Сумма слагаемых, которые по модулю > e: %.6f%n", sumE);
        System.out.printf(Locale.US, "3) Сумма слагаемых, которые по модулю > e/10: %.6f%n", sumE10);
        System.out.printf(Locale.US, "4) Точное значение функции (Math): %.6f%n", exValue);

        scanner.close();
    }
}