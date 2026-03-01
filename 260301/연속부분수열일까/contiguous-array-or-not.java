import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 수열 A: [n1개의 원소]
        // 수열 B: [n2개의 원소]
        // 수열 B가 A의 연속부분수열인지 판단하는 프로그램

        // 1. 입력
        Scanner sc = new Scanner(System.in);
        // n1, n2
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        // 수열 A
        int[] a = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        // 수열 B
        int[] b = new int[n2];
        for (int i = 0;i < n2; i++) {
            b[i] = sc.nextInt();
        }
        boolean ans = false;
        for (int i = 0; i < n1; i++) { // 수열 A 순회
            if (a[i] == b[0] && ((i + n2) < n1)) { // 수열 B의 첫 번째 값
                ans = true;
                for (int j = 0; j < n2; j++) {
                    if (a[i+j] != b[j]) {
                        ans = false;
                        break;
                    }
                }
                if (ans) {
                    break;
                }
            }
        }

        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}