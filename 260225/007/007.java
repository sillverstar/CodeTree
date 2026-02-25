import java.util.Scanner;
class Secret {
    String sCode;
    char mPoint;
    int time;
    public Secret(String sCode, char mPoint, int time) {
        this.sCode = sCode;
        this.mPoint = mPoint;
        this.time = time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        Secret secret = new Secret(sCode, mPoint, time);

        System.out.println("secret code : " + secret.sCode);
        System.out.println("meeting point : " + secret.mPoint);
        System.out.println("time : " + secret.time);

    }
}