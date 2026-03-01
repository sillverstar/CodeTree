import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        // 2가 세 번째로 올 때의 인덱스+1

        // 1. 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 2. 탐색 & 2 count
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                count++;
            }
            if (count == 3) {
                System.out.println(i+1);
                return;
            }
        }
    }
}