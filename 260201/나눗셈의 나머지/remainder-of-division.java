import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] remain = new int[b];

        while (a > 1) {
            int temp = a % b;
            remain[temp] += 1;
            a /= b;
        }

        int powsum = 0;
        for (int i = 0; i < b; i++) {
            powsum += Math.pow(remain[i], 2);
        }
        System.out.print(powsum);

    }
}