import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение (целые числа от 1 до 10): ");
        String input = scanner.nextLine();

        String result = calc(input);
        System.out.println("" + result);
    }
    public static String calc(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            if (parts.length > 3) {
                return "Вы ввели более двух операндов";
            } else {
                return "Неправильный формат выражения";
            }
        }

        try {
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[2]);

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                return "Числа должны быть от 1 до 10";
            }

            int result = 0;
            char operation = parts[1].charAt(0);
            switch (operation) {
                case '+':
                    result = a + b;
                    break;
                case '-':
                    result = a-b;
                    break;
                case '*':
                    result = a * b;
                    break;
                case '/':
                    result = a / b;
                    break;
                default:
                    return "Неподдерживаемая операция.";
            }
            return Integer.toString(result);
        }
        catch (NumberFormatException e) {
            return "Введите целые числа";
        }
    }
}