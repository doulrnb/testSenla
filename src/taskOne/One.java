package taskOne;

/*      Задание 1
  Напишите программу, которая возвращает сумму цифр, присутствующих в данной строке.
  Если цифр нет, то возвращаемая сумма должна быть равна 0. */

import java.util.Scanner;

public class One {

    public static int sumOfDigits() {
        try {
            int n = Integer.parseInt(inputStr());   //Вводим строку
            int sum = 0;

            while (n !=0) {
                sum += (n % 10);
                n /= 10;
            }
            return sum;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    private static String  inputStr() {
        System.out.println("Input String:");
        return new Scanner(System.in).nextLine();
    }
}
