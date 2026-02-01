import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[12]; // 최악의 경우 초기항 1, 1
        arr[0] = 1;
        arr[1] = n;

        int i = 2;
        while (arr[i - 1] <= 100) {
            arr[i] = arr[i - 2] + arr[i - 1];
            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.printf("%d ", arr[j]);
        }
    }
}