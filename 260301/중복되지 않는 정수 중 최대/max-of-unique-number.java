import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 중복하여 등장하지 않는 정수 중 최댓값

        // 1. 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 2. 정렬
        Arrays.sort(arr);

        // 3. maxValue;
        int maxValue = -1;
        boolean rep = false;
        for (int i = n-1; i >= 0; i--) {
            boolean left = ((i == 0) || arr[i-1] != arr[i])? true:false; // (i > 0) && -> (i == 0) ||: i가 0일 경우에는 왼쪽이 없어서 비교할 필요 없음. 무조건 true;
            boolean right = ((i == n-1) || arr[i] != arr[i+1])? true:false; // (i < n-1) && -> (i == n-1) ||: i가 n-1일 경우에는 오른쪽이 없어서 비교할 필요 없음. 무조건 true;

            if (left && right) {
                maxValue = arr[i];
                break;
            }
            
        }
        System.out.println(maxValue);
    }
}