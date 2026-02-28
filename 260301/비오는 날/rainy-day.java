import java.util.Scanner;
class Predict {
    String date;
    String weekday;
    String weather;

    Predict(String date, String weekday, String weather) {
        this.date = date;
        this.weekday = weekday;
        this.weather = weather;
    }

    public String toString() {
        return this.date + " " + this.weekday + " " + this.weather;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ansIdx = 0;
        Predict[] arr = new Predict[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            // Please write your code here.
            arr[i] = new Predict(date, day, weather);
            if (weather.equals("Rain")) ansIdx = i;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i].weather.equals("Rain")) {
                if (arr[i].date.compareTo(arr[ansIdx].date) < 0) {
                    ansIdx = i;
                }
            }
        }

        System.out.println(arr[ansIdx]);
    }
}