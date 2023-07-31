import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ex0();
    }

    public static void ex0() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println();
        int index = sc.nextInt();
        if (index < arr.length && index >= 0) {
            arr[index] = 1;
        } else {
            System.out.println();
        }
        sc.close();
    }
}
