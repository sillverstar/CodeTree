import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();

        int cnt = n;
        for (int i = 0; i < n; i++) {
            a += cnt;
            System.out.println(a);
        }
    }
}