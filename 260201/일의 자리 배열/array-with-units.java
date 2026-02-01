import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int pp = sc.nextInt();
        int p = sc.nextInt();

        System.out.print(pp + " " + p + " ");
        for (int i = 3; i <= 10; i++) {
            int next = (pp + p) % 10;
            pp = p;
            p = next;
            System.out.printf("%d ", next);
        }
    }
}