import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 입력
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 첫 번째 값
        int minVal = num; // 최솟값
        int maxVal = num; // 최댓값
        while (true) {
            num = sc.nextInt(); // 비교할 다음 값
            if ((num == 999) || (num == -999)) {
                break;
            }
            if (num < minVal) {
                minVal = num;
            }
            
            if (num > maxVal) {
                maxVal = num;
            }
        }

        System.out.println(maxVal + " " + minVal);
        
    }
}