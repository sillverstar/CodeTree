import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();

        if (a % 2 == 0) { a--; }
        while (a >= b) {
            System.out.printf("%d ", a);
            a -= 2;

        }
    }
}