import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) {
                break;
            }
            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            if (arr[i] % 2 == 1) {
                arr[i] += 3;
            }
            else {
                arr[i] /= 2;
            }
        }

        for (int i = 0; i < cnt; i++) {
            System.out.printf("%d ", arr[i]);
        }
        
    }
}