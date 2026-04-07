import java.util.Scanner;

public class Main {
    public static void recur1(int n) {
        if (n == 0) {
            return;
        }
        recur1(n-1);
        System.out.print(n + " ");
    }

    public static void recur2(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        recur2(n-1);
    }


    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        recur1(N);
        System.out.println();
        recur2(N);
    }
}