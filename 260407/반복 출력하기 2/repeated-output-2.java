import java.util.Scanner;
public class Main {
    
    public static void printHello(int cnt) {
        if (cnt == 0) {
            return;
        }
        
        printHello(cnt - 1);
        System.out.println("HelloWorld");
    }
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        printHello(N);
    }
}