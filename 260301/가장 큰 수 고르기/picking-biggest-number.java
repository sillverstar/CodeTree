import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 최댓값 구하기
        final int N = 10;

        // 1. 입력
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = 0;
        for (int i = 0; i < N; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);

    }
}