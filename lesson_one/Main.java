package lesson_one;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 2, 6, 7, 63 };
        System.out.println(checkLength(array));
    }

    static int checkLength(int[] arr) {
        int minLength = 5;
        if (arr.length < minLength) {
            return -1;
        }
        return arr.length;
    }

}