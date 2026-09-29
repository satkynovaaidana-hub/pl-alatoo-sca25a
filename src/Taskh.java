import java.util.Scanner;
public class Taskh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.out);
        int n = scanner.nextInt();
        System.out.println((n / 10) % 10);
    }
}