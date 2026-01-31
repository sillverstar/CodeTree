import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        double avg = 0.0;
        for (int i = 1; i <= 10; i++) {
            arr[i - 1] = sc.nextInt();
            if (i % 2 == 0) {
                sum += arr[i - 1];
            }
            if (i % 3 == 0) {
                avg += arr[i - 1];
            }
        }

        avg = (double) avg / (10 / 3);
        System.out.printf("%d %.1f", sum, avg);
    }
}