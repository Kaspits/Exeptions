package lesson_one;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] { 2, 6, 7, 63 };
        speak(array);
    }

    private static void speak(Integer[] array) {
        System.out.println("РЈРєР°Р¶РёС‚Рµ РёСЃРєРѕРјРѕРµ С‡РёСЃР»Рѕ");
        try (Scanner scanner = new Scanner(System.in)) {
            int num = scanner.nextInt();
            int code = check(array, num);
            parseCode(code);
        }
    }

    private static void parseCode(int code) {
        switch (code) {
            case -1:
                System.out.println(
                        "Р”Р»РёРЅРЅР° РјР°СЃСЃРёРІР° РјРµРЅСЊС€Рµ РјРёРЅРёРјР°Р»СЊРЅРѕРіРѕ РЅРµРѕР±С…РѕРґРёРјРѕРіРѕ");
                break;
            case -2:
                System.out.println("РСЃРєРѕРјС‹Р№ СЌР»РµРјРµРЅС‚ РЅРµ РЅР°Р№РґРµРЅ");
                break;
            case -3:
                System.out.println("РњР°СЃСЃРёРІ РЅРµ РёРЅРёС†РёР°Р»РёР·РёСЂРѕРІР°РЅ");
                break;
            case -4:
                System.out
                        .println("РСЃРєРѕРјРѕРµ С‡РёСЃР»Рѕ Р±РѕР»СЊС€Рµ РјР°РєСЃРёРјР°Р»СЊРЅРѕРіРѕ РІ РјР°СЃСЃРёРІРµ");
                break;
            case -5:
                System.out.println("РСЃРєРѕРјРѕРµ С‡РёСЃР»Рѕ РјРµРЅСЊС€Рµ РјРёРЅРёРјР°Р»СЊРЅРѕРіРѕ РІ РјР°СЃСЃРёРІРµ");
                break;
            default:
                System.out.println("РРЅРґРµРєСЃ СЌР»РµРјРµРЅС‚Р° СЂР°РІРµРЅ: " + code);
        }
    }

    private static int check(Integer[] arr, int num) {
        if (arr == null) {
            return -3;
        }
        int minLength = 5;
        if (arr.length < minLength) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        int max = Collections.max(Arrays.asList(arr));
        int min = Collections.min(Arrays.asList(arr));
        if (num > max) {
            return -4;
        }
        if (num < min) {
            return -5;
        }
        return -2;
    }
}
