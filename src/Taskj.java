import java.util.Scanner;

public class Taskj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n + 2 - Math.abs(n % 2));
    }
}