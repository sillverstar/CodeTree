import java.util.Scanner;
class User {
    String id;
    int level;

    User() {
        this.id = "";
        this.level = 0;
    }
    User(String id, int level) {
        this.id = id;
        this.level = level;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        // Please write your code here.
        User u1 = new User();
        u1.id = "codetree";
        u1.level = 10;
        User u2 = new User(id, level);
        System.out.println("user " + u1.id + " lv " + u1.level);
        System.out.println("user " + u2.id + " lv " + u2.level);
    }
}