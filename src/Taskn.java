import java.util.Scanner;

public class Taskn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int totalMinutes = n * 45 + (n / 2) * 5 + ((n - 1) / 2) * 15;

        int hours = 9 + totalMinutes / 60;
        int minutes = totalMinutes % 60;

        System.out.println(hours + " " + minutes);
    }
}