import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 2 || i == 4 || i == 9) {
                sum += sc.nextInt();
            }
            else {
                int pass = sc.nextInt();
            }
        }

        System.out.print(sum);
    }
}