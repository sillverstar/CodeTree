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

        // 2. 최솟값 탐색 + 최솟값 개수 탐색
        int minVal = arr[0];
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            // 최솟값 갱신
            if (minVal > arr[i]) {
                minVal = arr[i];
                cnt = 1; // 개수 초기화
            }

            // 최솟값 개수 갱신
            else if (minVal == arr[i]) {
                cnt++;
            }
        }

        System.out.println(minVal + " " + cnt);
    }
}