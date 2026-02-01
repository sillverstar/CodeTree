import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String[] result = new String[q];
        for (int i = 0; i < q; i++) {
            int q1 = sc.nextInt();
            if (q1 == 1) {
                int param = sc.nextInt();
                result[i] = "" + arr[param - 1];
            }
            else if (q1 == 2) {
                int param = sc.nextInt();
                for (int j = 0; j < n; j++) {
                    result[i] = "0";
                    if (arr[j] == param) {
                        result[i] = "" + (j + 1);
                        break;
                    }
                }
                
            }
            else if (q1 == 3) {
                int param1 = sc.nextInt();
                int param2 = sc.nextInt();
                result[i] = "";
                for (int j = param1 - 1; j < param2; j++) {
                    result[i] += arr[j] + " ";
                }
            }
        }

        for (int i = 0; i < q; i++) {
            System.out.println(result[i]);
        }
    }
}