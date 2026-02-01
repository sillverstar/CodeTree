import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int np = n;
        int cnt = 0;
        while (cnt != 2) {
            if (np % 5 == 0) {
                cnt++;
            }
            System.out.printf("%d ", np);
            np += n;
        }

    }
}