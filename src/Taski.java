import java.util.Scanner;

public class Taski {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.com.in);
        int n = scanner.nextInt();

        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;

        System.out.println(hundreds + tens + units);
    }
}