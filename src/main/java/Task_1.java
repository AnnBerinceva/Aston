import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        //создаем объект класса Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Число a = "); //вводим число a
        int a = scanner.nextInt();

        System.out.print("Число b = "); //вводим число b
        int b = scanner.nextInt();

        //сравниваем
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        //операции сложения, вычитания, деления и умножения
        int sum = a + b;
        int dif = a - b;
        double degree = (double) a /b;
        int mult = a * b;

        //результат выводим в консоль
        System.out.println("Сумма a, b = " + sum);
        System.out.println("Вычитание (a - b) = " + dif);
        System.out.println("Деление (a / b): " + degree);
        System.out.println("Умножение (a * b) = " + mult);

        //закрываем сканнер
        scanner.close();
    }
}