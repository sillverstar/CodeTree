import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] cntArr = new int[10];
        while (true) {
            int temp = sc.nextInt();
            if (temp == 0) {
                break;
            }
            else {
                temp /= 10;
                cntArr[temp] += 1;
            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.printf("%d - %d%n", i, cntArr[i]);
        }
    }
}