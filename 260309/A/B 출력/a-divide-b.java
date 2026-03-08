import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        String result = a / b + ".";
        a %= b;
        for (int i = 0; i < 20; i++) {
            a *= 10;
            result += a / b;

            a %= b;
        }

        System.out.printf(result);
    }
}