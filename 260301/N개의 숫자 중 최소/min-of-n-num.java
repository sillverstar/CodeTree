import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. 최솟값 탐색
        int minVal = arr[0];
        for (int i = 1; i < n; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
        }

        // 3. 최솟값 개수 탐색
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (minVal == arr[i]) {
                cnt++;
            }
        }
        System.out.println(minVal + " " + cnt);
    }
}