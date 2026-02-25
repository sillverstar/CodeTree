import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        boolean ans = true;
        if (m >=13 || d >= 32) ans = false;
        if ((d>28 && d<31) && m == 2) ans = false;
        if (d == 31
        && ((m%2!=0 && m > 8)||(m%2==0 && m < 7))) ans = false;


        if (ans) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}