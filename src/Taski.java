import java.util.Scanner;

public class Taski {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = n / 100;
        int b = (n / 10) % 10;
        int c = n % 10;

        System.out.println(a + b + c);
    }
}