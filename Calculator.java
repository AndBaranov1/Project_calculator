import java.util.Scanner;

/**
 * Created by 1 on 17.03.2018.
 * Разработка консольного калькулятора
 */

public class Calculator {
    public static void main(String[] args) {
        //Создаем объект класса Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите задание и нажимет Enter:(1-Calculator, 2-String array)");
        int num = scanner.nextInt();
        //Проверяем если нажали 1, то выполняется калькулятор
        if (num == 1) {
            //Выводим в консоль текст "Введите первое число"
            System.out.println("Введите первое число и нажмите Enter");
            //Cчитывает целое число с потока ввода и сохраняем в переменную "first_value"
            double first_value = scanner.nextDouble();
            System.out.println("Выберите операцию: +,-,/,* и нажмите Enter");
            String operation = scanner.next();
            System.out.println("Введите второе число и нажмите Enter");
            //Cчитывает целое число с потока ввода и сохраняем в переменную "second_value"
            double second_value = scanner.nextDouble();
            /**В цикле проводим сравнение, если операция выбрана "+" то складываем значение двух переменных.
             Аналогично и для остальных операций */
            if (operation.equals("+")) {
                //При выводе результат происходит форматирование до 4 знаков после запятой
                System.out.printf("Результат: %.4f", (first_value + second_value));
            }
            if (operation.equals("-")) {
                System.out.printf("Результат: %.4f", (first_value - second_value));
            }
            if (operation.equals("/")) {
                System.out.printf("Результат: %.4f", (first_value / second_value));
            }
            if (operation.equals("*")) {
                System.out.printf("Результат: %.4f", (first_value * second_value));
            }
            //Если нажали 2, то поиск максималього слова в массиве
        } else if (num == 2) {
            System.out.println("Введите размер массива:");
            int size = scanner.nextInt();
            String[] array = new String[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.next();
            }
            String max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i].length() > max.length())
                    max = array[i];
            }
            System.out.println("Результат: " + max);
        }
    }
}
