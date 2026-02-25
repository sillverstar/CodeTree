import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        // Please write your code here.

        // 정렬

        // for 비교
        boolean ans = false;
        for (int i = 0; i < n1; i++) {
            if (a[i] == b[0]) {
                for (int j = 0; j < n2; j++) {
                    if (a[i+j] != b[j]) {
                        ans = false;
                        break;
                    }
                    ans = true;
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