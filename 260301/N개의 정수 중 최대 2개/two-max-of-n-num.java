import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 내림차순으로 정렬했을 때 0, 1번째 정수 -> 가장 큰 두 개의 수
        // 정렬 쓰지 말고 최댓값 두 개 출력해보기

        // 1. 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. 정렬 [maxVal1 < maxVal2]
        int maxVal1, maxVal2;
        if (arr[0] < arr[1]) {
            maxVal1 = arr[0];
            maxVal2 = arr[1];
        } else {
            maxVal1 = arr[1];
            maxVal2 = arr[0];
        }
        for (int i = 2; i < n; i++) {
            // 다음 값의 위치 확인
            // <----(1)----(maxVal1)----(2)----(maxVal2)----(3)---->
            // (1): nope
            // (2): maxVal1 <- new value, maxVal2 그대로
            // (3): maxVal1 <- maxVal2, maxVal2 <- new value
            // 3번부터 판단.
            if (arr[i] > maxVal2) { // 가장 큰 값과 먼저 비교
                maxVal1 = maxVal2;
                maxVal2 = arr[i];
            }
            else if (arr[i] > maxVal1) {
                maxVal1 = arr[i];
            }
        }
        System.out.println(maxVal2 + " " + maxVal1);
        
    }
}