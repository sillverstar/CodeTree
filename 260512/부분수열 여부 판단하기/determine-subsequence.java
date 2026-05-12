import java.util.*;
import java.io.*;

public class Main {
    public static boolean isSub(int[] A, int[] B) {
        int a = 0;
        
        for (int b = 0; b < B.length; b++) {
            while (a < A.length && A[a] != B[b]) {
                a++;
            }

            if (a == A.length) {
                return false;
            } else {
                a++;
            }
        }
        
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lengthA = Integer.parseInt(st.nextToken());
        int lengthB = Integer.parseInt(st.nextToken());

        int[] A = new int[lengthA];
        int[] B = new int[lengthB];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < lengthA; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < lengthB; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        if (isSub(A, B)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}