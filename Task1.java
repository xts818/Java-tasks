import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите радиус малой окружности (r1): ");
        double r1 = scanner.nextDouble();
        
        System.out.print("Введите радиус большой окружности (R2): ");
        double r2 = scanner.nextDouble();
        
        if (r2 < r1 || r1 <= 0 || r2 <= 0) {
             System.out.println("Радиусы должны быть больше нуля, и R2 не может быть меньше r1!"); }
        else {
            double smallS = 3.14 * r1 * r1;

            double bigS = 3.14 * r2 * r2;

            double diff = bigS - smallS;
            
            System.out.println("Площадь заштрихованной части равна: " + diff);
        }
    }
}