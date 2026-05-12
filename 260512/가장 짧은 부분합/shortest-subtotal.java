import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int right = 0;
        
        for (int left = 1; left <= N; left++) {
            while (right + 1 <= N && sum < S) { // sum이 S보다 작으면 계속 더함
                sum += arr[right + 1];
                right++;
            }
            
            if (sum >= S) {

                ans = Math.min(ans, right - left + 1);
            }

            sum -= arr[left];
        }

        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}