import java.util.Scanner;

public class Taska {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double k = Math.sqrt(a*a + b*b);
        System.out.println(k);

    }
}