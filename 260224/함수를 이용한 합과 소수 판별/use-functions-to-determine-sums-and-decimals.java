import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int res = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                int temp = i;
                int cnt = 0;
                while (temp > 0) {
                    cnt += temp % 10;
                    temp = temp / 10;
                }
                if (cnt % 2 == 0) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
    public static  boolean isPrime(int num) {
        for (int i = 2; i <= (num/2)+1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}