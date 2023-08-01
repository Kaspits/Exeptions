package HW2;
/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) {
        num();
    }

    public static void num() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            float result = getFloatFromUser(bufferedReader);
            bufferedReader.close();
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("Возникла ошибка при работе с файлом.");
            return;
        }
    }

    private static float getFloatFromUser(BufferedReader bufferedReader) {
        System.out.println("Введите число");
        float result;
        try {
            result = Float.parseFloat(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Произошла ошибка при преобразовании введенного значения в число с плавающей точкой.");
            return getFloatFromUser(bufferedReader);
        } catch (Exception e) {
            System.out.println("произошла ошибка при получении числа");
            return getFloatFromUser(bufferedReader);
        }

        return result;
    }

}
