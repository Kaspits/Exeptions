package HW2;
/*Разработайте программу, которая выбросит Exception,  когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        str();
    }

    public static void str() {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            boolean isContinue = true;
            while (isContinue) {
                try {
                    System.out.println("Введите");
                    String text = getTextFromUser(bufferedReader);
                    System.out.println(text);
                    isContinue = false;
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Возникла ошибка при работе с консолью");
        }
    }

    private static String getTextFromUser(BufferedReader bufferedReader) throws IOException {
        String text = bufferedReader.readLine();

        if (text.isEmpty()) {
            throw new RuntimeException("введена пустая строка");
        }
        return text;
    }
}
