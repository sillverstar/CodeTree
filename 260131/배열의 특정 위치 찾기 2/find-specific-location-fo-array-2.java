import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
         
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            if (i % 2 == 0) { // 홀수번째 입력 (1 3 5 ...)
                sumOdd += arr[i];
            }
            else {
                sumEven += arr[i];
            }
        }

        System.out.println(Math.abs(sumOdd - sumEven));
    }
}