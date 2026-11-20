import java.util.Scanner;

public class Task7 {
    static int[] solution(int[] array, int a) {
        int start = -1, length = 0, second = -1;

        for (int left = 0; left < array.length; left++) {
            int min = array[left], max = array[left];
            for (int right = left; right < array.length; right++) {
                min = Math.min(min, array[right]);
                max = Math.max(max, array[right]);
                if ((long) max - min > a) break;

                int current = right - left + 1;
                if (current > length) {
                    start = left;
                    length = current;
                    second = -1;
                } else if (current == length && second == -1) {
                    second = left;
                }
            }
        }
        return new int[]{second == -1 ? start : second, length};
    }

    static int[] readArray(Scanner scanner) {
        System.out.print("Количество элементов: ");
        int[] array = new int[scanner.nextInt()];
        System.out.print("Элементы через пробел: ");
        for (int i = 0; i < array.length; i++) array[i] = scanner.nextInt();
        return array;
    }

    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    static void test(int[] array, int a) {
        System.out.print("\nМассив: ");
        printArray(array);
        System.out.println("a = " + a);
        System.out.print("Результат {начало, длина}: ");
        printArray(solution(array, a));
    }

    public static void main(String[] args) {
        test(new int[]{1, 2, 3, 10, 11}, 2);
        test(new int[]{1, 5, 3, 4, 8, 7, 6, 10}, 2);
        test(new int[]{1, 2, 5, 6, 9, 10}, 1);
        test(new int[]{7, 7, 7, 7}, 0);
        test(new int[]{1, 2, 3, 4}, 3);
        test(new int[]{1, 2, 4, 8}, 0);
        test(new int[]{-10, -8, -6, 5, 4, 3}, 2);
        test(new int[]{1, 1, 2, 2, 2, 1}, 0);
        test(new int[]{42}, 0);
        test(new int[]{}, 5);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите свой массив");
        int[] array = readArray(scanner);
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Результат {начало, длина}: ");
        printArray(solution(array, a));
    }
}