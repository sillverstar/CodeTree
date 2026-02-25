import java.util.Scanner;
class Agent {
    char codeName;
    int grade;

    public Agent(char codeName, int grade) {
        this.codeName = codeName;
        this.grade = grade;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        Agent[] arr = new Agent[5];
        
        for (int i = 0; i < 5; i++) {
            arr[i] = new Agent(sc.next().charAt(0), sc.nextInt());
        }

        int mingrade = 101;
        int minIdx = -1;
        for (int i = 0; i < 5; i++) {
            if (arr[i].grade < mingrade) {
                mingrade = arr[i].grade;
                minIdx = i;
            }
        }

        System.out.println(arr[minIdx].codeName + " " + arr[minIdx].grade);
    }
}