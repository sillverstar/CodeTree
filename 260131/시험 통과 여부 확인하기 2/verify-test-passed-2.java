import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] result = new String[n];
        int pass = 0;
        
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += sc.nextInt();
            }
            double avg = (double) sum / 4;
            if (avg >= 60) {
                result[i] = "pass";
                pass++;
            }
            else {
                result[i] = "fail";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
        System.out.println(pass);

    }
}