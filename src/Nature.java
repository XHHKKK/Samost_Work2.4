import java.util.Scanner;

public class Nature {

    // Метод для подсчета количества цифр в числе
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух натуральных чисел
        System.out.print("Введите первое натуральное число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе натуральное число: ");
        int num2 = scanner.nextInt();

        // Получаем количество цифр в каждом числе
        int digitsInNum1 = countDigits(num1);
        int digitsInNum2 = countDigits(num2);

        // Сравниваем количество цифр и выводим результат
        if (digitsInNum1 > digitsInNum2) {
            System.out.println("В первом числе (" + num1 + ") больше цифр: " + digitsInNum1);
        } else if (digitsInNum1 < digitsInNum2) {
            System.out.println("Во втором числе (" + num2 + ") больше цифр: " + digitsInNum2);
        } else {
            System.out.println("Оба числа имеют одинаковое количество цифр: " + digitsInNum1);
        }
    }
}
