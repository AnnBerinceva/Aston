import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        //создаем объект класса Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Строка a - "); //вводим строку a
        String a = scanner.nextLine();

        System.out.print("Строка b - ");  //вводим строку b
        String b = scanner.nextLine();

        //сравниваем
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");

            scanner.close();
        }
    }
}