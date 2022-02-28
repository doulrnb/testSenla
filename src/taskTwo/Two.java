package taskTwo;

/*Создайте программу, которая будет вычислять и выводить на экран простые множители,
  из которых состоит целое число, введенное пользователем.
  Если введенное число не целое, то нужно сообщать пользователю об ошибке. */

import java.util.Scanner;

public class Two {
    public static void primeFactors() {
        try {
            int value = inputValue();
            int multiplier = 2;         //первый множитель
            double sqrt = Math.sqrt(value);

            while (value > 1 && multiplier <= sqrt) {
                if (value % multiplier == 0) {
                    System.out.print(multiplier + " ");
                    value /= multiplier;
                } else if (multiplier == 2){
                    multiplier++;
                } else multiplier += 2;
            }
            if (value != 1) {
                System.out.print(value);
            }

        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }

    private static int inputValue() {
        System.out.println("Input value: ");
        return new Scanner(System.in).nextInt();
    }
}
