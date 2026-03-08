import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        String result = "";
        for (int i = 0; i < 21; i++) {
            if (i == 0) {   
                result += a / b;
                result += ".";
            } else {
                a = (a % b) * 10;
                result += a / b;
            }
        }

        System.out.printf(result);
    }
}