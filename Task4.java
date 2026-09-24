import java.util.Scanner;

public class Task4 {
    public static boolean isValid(int number, int a, int b) {
        return (number % a == 0) && (number % b != 0);
    }
    public static long SumOfNumbers(int n, int a, int b) {
        long sum = 0;
        int count = 0;
        int currentNum = 1;

        while (count < n) {
            if (isValid(currentNum, a, b)) {
                sum += currentNum;
                count++;
            }
            currentNum++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите количество чисел (n): ");
        int n = input.nextInt();
        
        System.out.print("Введите делитель (a): ");
        int a = input.nextInt();
        
        System.out.print("Введите исключаемый делитель (b): ");
        int b = input.nextInt();

        if (n <= 0 || a <= 0 || b <= 0) {
            System.out.println("Ошибка: все параметры должны быть больше 0.");
            return;
        }
        long totalSum = SumOfNumbers(n, a, b);
        System.out.printf("Сумма первых %d чисел: %d\n", n, totalSum);
    }
}