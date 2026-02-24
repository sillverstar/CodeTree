import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.

        if (o == '+') {
            int ans = a + c;
            System.out.println(a + " + " + c + " = " + ans);
        }
        else if (o == '-') {
           int ans = a - c;
           System.out.println(a + " - " + c + " = " + ans);
        }
        else if (o == '*') {
            int ans = a * c;
            System.out.println(a + " * " + c + " = " + ans);
        }
        else if (o == '/') {
            int ans = a / c;
            System.out.println(a + " / " + c + " = " + ans);
        }
        else {
            System.out.println("False");
        }
    }
}