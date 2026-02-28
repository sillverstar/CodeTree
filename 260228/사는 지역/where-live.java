import java.util.*;

class Area {
    String name;
    String address;
    String areaName;

    Area(String name, String address, String areaName) {
        this.name = name;
        this.address = address;
        this.areaName = areaName;
    }
    public String toString() {
        return "name " + this.name + "\naddr " + this.address + "\ncity " + this.areaName;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        String[] addresses = new String[n];
        String[] regions = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            addresses[i] = sc.next();
            regions[i] = sc.next();
        }
        // Please write your code here.
        Area[] arr = new Area[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Area(names[i], addresses[i], regions[i]);
        }

        Arrays.sort(arr, (o1, o2) -> o1.name.compareTo(o2.name));

        System.out.println(arr[n-1]);
    
    }
}