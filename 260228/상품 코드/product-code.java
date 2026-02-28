import java.util.Scanner;
class Product {
    String name;
    int code;

    Product() {
        this.name = "";
        this.code = 0;
    }
    Product(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String toString() {
        return "product " + this.code + " is " + this.name;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.

        Product p1 = new Product();
        p1.name = "codetree";
        p1.code = 50;
        Product p2 = new Product(id2, code2);

        System.out.println(p1);
        System.out.println(p2);
    }
}