import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        // проверка сканнера текста
        System.out.println("Введите Ваше имя: ");
        String username = scan.nextLine();
        System.out.println("Привет, " + username);

        // проверка сканнера чисел
        System.out.println("Введите Ваш возраст: ");
        int num1 = scan.nextByte();
        System.out.println("Возраст: " + num1);

        // попытка калькулятора слабого (пока что без понятия как сделать выбор операции)
        System.out.println("Калькулятор выдаёт сразу 4 операции: ");
        System.out.println("Введите первое число: ");
        float num2 = scan.nextInt();
        System.out.println("Введите второе число: ");
        float num3 = scan.nextInt();
        float res1 = num2 + num3;
        float res2 = num2 - num3;
        float res3 = num2 * num3;
        float res4 = num2 / num3;
        System.out.println("Сложение: " + res1 + "\n" + "Вычитание: " + res2 + "\n" + "Произведение: " + res3 + "\n" + "Числитель: " + res4);
    }
}