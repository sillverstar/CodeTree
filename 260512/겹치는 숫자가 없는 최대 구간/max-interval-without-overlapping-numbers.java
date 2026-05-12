import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        int[] countArray = new int[100001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int ans = 0;
        int right = 0;

        for (int left = 1; left <= N; left++) {
            while (right + 1 <= N && countArray[arr[right + 1]] == 0) {
                countArray[arr[right + 1]]++;
                right++;
            }

            ans = Math.max(ans, right - left + 1);

            countArray[arr[left]]--;
        }
        System.out.println(ans);
    }
}