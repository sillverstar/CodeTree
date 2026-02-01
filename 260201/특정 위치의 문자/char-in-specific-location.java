import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[6];

        arr[0] = 'L';
        arr[1] = 'E';
        arr[2] = 'B';
        arr[3] = 'R';
        arr[4] = 'O';
        arr[5] = 'S';

        char n = sc.next().charAt(0);

        for (int i = 0; i < 6; i++) {
            if (n == arr[i]) {
                System.out.print(i);
                return;
            }
        }
        System.out.print("None");

    }
}