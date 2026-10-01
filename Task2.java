import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите счёт первой команды (N): ");
        int n = scanner.nextInt();

        System.out.print("Введите счёт второй команды (M): ");
        int m = scanner.nextInt();

        if (n < 0 || m < 0) {
            System.out.println("Ошибка: счёт не может быть отрицательным!");
            return;
        }

        int pointsTeam1 = 0;
        int pointsTeam2 = 0;

        if (n > m) {
            pointsTeam1 = 3;
            pointsTeam2 = 0;
        } else if (n < m) {
            pointsTeam1 = 0;
            pointsTeam2 = 3;
        } else {
            pointsTeam1 = 1;
            pointsTeam2 = 1;
        }

        System.out.println("Счёт матча — " + n + ":" + m);
        System.out.println("Очки первой команды: " + pointsTeam1);
        System.out.println("Очки второй команды: " + pointsTeam2);

        scanner.close();
    }
}