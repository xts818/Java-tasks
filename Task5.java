import java.util.Scanner;

public class Task5 {

    public static void printFigure(int s) {
        int half = s / 2;
        
        int spaces = half - 1; 
        int maxNum = 0;        

        for (int row = 1; row <= s; row++) {
            
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            if (row <= half) {
                for (int num = 0; num <= maxNum; num++) {
                    System.out.print(num);
                }
            } else {
                for (int num = maxNum; num >= 0; num--) {
                    System.out.print(num);
                }
            }

            System.out.println();

            if (row < half) {
                spaces--;
                maxNum++;
            } else if (row > half) {
                spaces++;
                maxNum--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 0;

        while (true) {
            System.out.print("Введите размер фигуры (целое, положительное, четное число >= 2): ");
            
            if (scanner.hasNextInt()) {
                s = scanner.nextInt();

                if (s >= 2 && s % 2 == 0) {
                    break;
                } else {
                    System.out.println("Ошибка! Число должно быть целым, неотрицательным, четным и не меньше 2.");
                }
            } else {
                System.out.println("Нужно ввести подходящее число.");
                scanner.next();
            }
        } 

        System.out.println("\nРезультат:");
        printFigure(s);
        scanner.close();
    }
}