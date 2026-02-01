import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] cntArr = new int[4];

        for (int i = 0; i < 3; i++) {
            char symptom = sc.next().charAt(0);
            int temp = sc.nextInt();

            if (symptom == 'Y') {
                if (temp >= 37) {
                    cntArr[0] += 1;
                }
                else {
                    cntArr[2] += 1;
                }
            }
            else {
                if (temp >= 37) {
                    cntArr[1] += 1;
                }
                else {
                    cntArr[3] += 1;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.printf("%d ", cntArr[i]);
        }
        if (cntArr[0] >= 2) {
            System.out.print('E');
        }
    }
}