import java.util.Scanner;

public class Taskh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println((n / 10) % 10);
    }
}